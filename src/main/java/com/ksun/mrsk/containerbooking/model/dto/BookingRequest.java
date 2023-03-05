package com.ksun.mrsk.containerbooking.model.dto;

import javax.validation.constraints.NotNull;

public class BookingRequest extends CheckRequest {

    @NotNull(message = "timestamp")
    //@Pattern(regexp = )todo ^(19|20)\d\d-(0[1-9]|1[012])-([012]\d|3[01])T([01]\d|2[0-3]):([0-5]\d):([0-5]\d)$
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
