package com.ksun.mrsk.containerbooking.model.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CheckRequest {

    @NotNull
    private Integer containerSize;
    @NotNull
    private ContainerType containerType;
    @Max(20)
    @NotNull
    private String origin;
    @Min(5)
    @Max(20)
    @NotNull
    private String destination;
    @Min(1)
    @Max(100)
    @NotNull
    private Integer quantity;

    public CheckRequest() {
    }

    public CheckRequest(Integer containerSize,
                        ContainerType containerType,
                        String origin,
                        String destination,
                        Integer quantity) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    public Integer getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}