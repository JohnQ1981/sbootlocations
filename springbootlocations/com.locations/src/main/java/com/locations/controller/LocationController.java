package com.locations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String saveLocation(@ModelAttribute("locations")Locations location, ModelMap modelMap) {
		Locations locationSaved = service.saveLocation(location);
		String msg="Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("message", msg);
		return "createLocation";
		
	}
	

}
