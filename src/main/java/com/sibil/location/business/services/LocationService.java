package com.sibil.location.business.services;

import com.sibil.location.DB.LocationDAO;
import com.sibil.location.model.Location;

import java.util.List;

public class LocationService {
private  LocationDAO locationDAO;

public LocationService (final LocationDAO locationDAO){
    this.locationDAO=locationDAO;
}
public List<Location> getLocation(){
    return this.locationDAO.getLocations();
}
public Location getLocation(int id){
    return this.locationDAO.getLocations(id);
}
public void insertLocation(Location location){
    this.locationDAO.insertLocation(location);
}
}
