package com.randomuser.randomuser.dto;

public class CoordinatesDto {
    private String latitude;
    private String longitude;

    public CoordinatesDto(){}

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
