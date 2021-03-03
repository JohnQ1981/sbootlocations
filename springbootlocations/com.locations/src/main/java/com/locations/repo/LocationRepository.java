package com.locations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.entities.Locations;

public interface LocationRepository extends JpaRepository<Locations, Integer> {

}
