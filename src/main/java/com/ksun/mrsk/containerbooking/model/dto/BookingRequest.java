package com.ksun.mrsk.containerbooking.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class BookingRequest extends CheckRequest {

    @NotNull(message = "timestamp")
    @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})Z$")
    private String timestamp;

    public BookingRequest(Integer containerSize, ContainerType containerType, String origin, String destination,
                          Integer quantity, String timestamp) {
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
