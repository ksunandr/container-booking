package com.ksun.mrsk.containerbooking.model.entity;


import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table(value = "bookings")
public class Booking implements Serializable {

    @PrimaryKey("booking_ref")
    private int bookingRef;
    @Column(value = "container_size")
    private Integer containerSize;
    @Column(value = "origin")
    private String origin;
    @Column(value = "destination")
    private String destination;
    @Column(value = "quantity")
    private Integer quantity;
    @Column(value = "timestamp")
    private String timestamp;

    public Booking( Integer containerSize, String origin, String destination, Integer quantity, String timestamp) {
        this.containerSize = containerSize;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public int getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(int bookingRef) {
        this.bookingRef = bookingRef;
    }

    public Integer getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
