package com.locations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locations.entities.Locations;
import com.locations.repo.LocationRepository;

@Service
public class LocationSericeImpl implements LocationService {

	@Autowired
	private LocationRepository repo;

	@Override
	public Locations saveLocation(Locations location) {
		return repo.save(location);
	}

	@Override
	public Locations upadteLocation(Locations location) {
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Locations location) {
		repo.delete(location);

	}

	@Override
	public Locations getLocationById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Locations> getAllLocations() {
		return repo.findAll();
	}

}
