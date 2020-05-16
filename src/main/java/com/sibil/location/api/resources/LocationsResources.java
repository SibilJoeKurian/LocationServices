package com.sibil.location.api.resources;

import com.sibil.location.business.services.LocationService;
import com.sibil.location.model.Location;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
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
    return Response.ok().entity(this.locationService.getLocation()).build();
    }
    @GET
    @Path("{id}")
    public Response getLocation(@PathParam("id") final int id){
        //return Response.ok().entity(id).build();
        return Response.ok().entity(this.locationService.getLocation(id)).build();
    }
    @POST
    public Response insertLocation(final @NotNull Location location){
        this.locationService.insertLocation(location);
        return Response.ok().build();
    }
}
