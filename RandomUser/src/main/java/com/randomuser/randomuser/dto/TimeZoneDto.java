package com.randomuser.randomuser.dto;

public class TimeZoneDto {
    private String offset;
    private String description;

    public TimeZoneDto(){}

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
