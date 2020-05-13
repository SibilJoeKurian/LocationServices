package com.sibil.location.Data;

public enum Country {

    US("United States Of America","US"),
    UK("United Kingdom","GB");
    private String name;
    private String countryCode;

    Country(String name, String countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }

}
