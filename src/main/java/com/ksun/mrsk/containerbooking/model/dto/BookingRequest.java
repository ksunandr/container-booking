package com.ksun.mrsk.containerbooking.model.dto;

public class BookingRequest {

    Integer containerSize; //– either 20 or 40
    ContainerType containerType; // – DRY, REEFER
    String origin;  //– min 5, max 20
    String destination;  //– min 5, max 20
    Integer quantity; // – min 1, max 100



}
