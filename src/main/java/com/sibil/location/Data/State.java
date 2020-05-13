package com.sibil.location.Data;

public enum State {
    ARIZONA("Arizona","AR"),
    COLORADO("Colorado","CO");
    private String stateName;
    private String stateCode;

    State(String stateName, String stateCode) {
        this.stateName = stateName;
        this.stateCode = stateCode;
    }

}
