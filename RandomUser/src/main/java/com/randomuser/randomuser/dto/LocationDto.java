package com.randomuser.randomuser.dto;

public class LocationDto {
    private StreetDto street;
    private String city;
    private String state;
    private String country;
    private String postcode;

    public LocationDto() {
    }

    public StreetDto getStreet() {
        return street;
    }

    public void setStreet(StreetDto street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
