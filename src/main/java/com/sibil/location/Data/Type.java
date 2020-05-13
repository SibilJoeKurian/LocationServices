package com.sibil.location.Data;

public enum Type {
    AMAZON("Amazon","AMZ"),
    UPS("Ups","UPS");
    private String typeName;
    private String typeCode;

    Type(String typeName, String typeCode) {
        this.typeName = typeName;
        this.typeCode = typeCode;
    }

}
