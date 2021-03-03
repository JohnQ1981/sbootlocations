package com.locations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locations.entities.Locations;
import com.locations.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/create")
	public String create() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("locations") Locations location, ModelMap modelMap) {
		Locations locationSaved = service.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("message", msg);
		return "createLocation";

	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Locations> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Locations locationById = service.getLocationById(id);
//		Locations location =new Locations(); also can me used
//		location.setId(id);
		service.deleteLocation(locationById);
		List<Locations> allLocations = service.getAllLocations();
		modelMap.addAttribute("locations", allLocations);
		return "displayLocations";
	}
	
	@RequestMapping ("/test")
	public String test() {
		return "test";
	}

	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Locations updateLocationById = service.getLocationById(id);
		modelMap.addAttribute("locations",updateLocationById);
		return "editLocation";
				
	}
	@RequestMapping("/editLocation")
	public String editLocation(@ModelAttribute("locations") Locations location, ModelMap modelMap) {
		
		service.upadteLocation(location);
		
		List<Locations> allLocations = service.getAllLocations();
		modelMap.addAttribute("locations",allLocations);
		return "displayLocations";
	}
}
