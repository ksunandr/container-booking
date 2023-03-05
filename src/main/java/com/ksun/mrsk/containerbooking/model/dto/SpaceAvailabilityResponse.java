package com.ksun.mrsk.containerbooking.model.dto;

public class SpaceAvailabilityResponse {

    private Integer availableSpace;

    public SpaceAvailabilityResponse(Integer availableSpace) {
        this.availableSpace = availableSpace;
    }

    public SpaceAvailabilityResponse() {
    }

    public Integer getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(Integer availableSpace) {
        this.availableSpace = availableSpace;
    }
}
