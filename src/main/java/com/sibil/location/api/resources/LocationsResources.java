package com.sibil.location.api.resources;

import com.sibil.location.business.services.LocationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/v1/locations")
@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
@Produces(MediaType.APPLICATION_JSON)
public class LocationsResources {
private LocationService locationService;
public LocationsResources(final LocationService locationService){
    this.locationService=locationService;
}
//Get all data from database
    @GET
    public Response getLocation(){
    return Response.ok().entity("{\"id\":\"2\"}").build();
    }
}
