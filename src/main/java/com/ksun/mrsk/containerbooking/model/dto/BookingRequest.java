package com.ksun.mrsk.containerbooking.model.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class BookingRequest extends BookingCheckRequest {


    @NotNull(message = "timestamp")
    //pattern
    private String timestamp;

    public BookingRequest() {
    }

    public BookingRequest(Integer containerSize, ContainerType containerType, String origin, String destination, Integer quantity, String timestamp) {
        super(containerSize, containerType, origin, destination, quantity);
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
