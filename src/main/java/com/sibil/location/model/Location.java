package com.sibil.location.model;

import com.sibil.location.Data.Country;
import com.sibil.location.Data.State;
import com.sibil.location.Data.Type;

public class Location extends BaseEntity{
    private Country country;
    private String LocationCode;
    private State state;
    private Type type;
    private String location;

    public Location(long id, long createdOn, long modifiedOn, Country country, String locationCode, State state, Type type, String location) {
        super(id, createdOn, modifiedOn);
        this.country = country;
        LocationCode = locationCode;
        this.state = state;
        this.type = type;
        this.location = location;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLocationCode() {
        return LocationCode;
    }

    public void setLocationCode(String locationCode) {
        LocationCode = locationCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
