package com.travel.baenang.api.model;

public enum PlaceType {

    TOURIST_SPOT("여행지", "T"),
    RESTAURANT("식당", "R")

    ;


    private String name;
    private String value;

    PlaceType(String name, String value) {
        this.name = name;
        this.value = value;

    }

}
