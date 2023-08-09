package com.example.demo.Repositori;

import com.example.demo.init.model.Location;
import com.example.demo.init.model.TransitLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService  {

    private LocationRepository locationRepository;
    private StorageLocationeRepository storageLocationeRepository;
    private TransitLocationeRepository transitLocationeRepository;
   @Autowired
    public LocationService(LocationRepository locationRepository,StorageLocationeRepository storageLocationeRepository,TransitLocationeRepository transitLocationeRepository) {
        this.locationRepository = locationRepository;
        this.storageLocationeRepository =storageLocationeRepository;
        this.transitLocationeRepository=transitLocationeRepository;
    }
    public void saveLocatione(Location location){
       locationRepository.save(location);
    }
    public void saveTransitLocatione(TransitLocation location){
        transitLocationeRepository.save(location);
    }
}
