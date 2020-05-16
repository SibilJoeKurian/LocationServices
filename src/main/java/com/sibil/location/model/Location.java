package com.sibil.location.model;

import com.sibil.location.Data.Country;
import com.sibil.location.Data.State;
import com.sibil.location.Data.Type;

public class Location extends BaseEntity{
    private Country country;
    private String code;
    private State state;
    private Type type;
    private String location;

    public Location(){

    }
    public Location(long id, long createdOn, long modifiedOn, Country country, State state, Type type,String code, String location) {
        super(id, createdOn, modifiedOn);
        this.country = country;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
