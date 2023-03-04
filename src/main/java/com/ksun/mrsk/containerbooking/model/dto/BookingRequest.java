package com.ksun.mrsk.containerbooking.model.dto;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class BookingRequest {

    @Min(value = 20, message = "ksan message") //todo
    @Max(40)
    @NotNull(message = "containerSizetette")
   // @NotBlank(message = "must not be blank!")
    private Integer containerSize; //– either 20 or 40
   //
    private ContainerType containerType; // – DRY, REEFER

    @Min(5)
    @Max(20)
    @NotNull(message = "tette")
    private String origin;  //– min 5, max 20

    @Min(5)
    @Max(20)
    String destination;  //– min 5, max 20

    @Min(1)
    @Max(100)
    Integer quantity; // – min 1, max 100

    public BookingRequest() {
    }

    public BookingRequest(Integer containerSize,
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
