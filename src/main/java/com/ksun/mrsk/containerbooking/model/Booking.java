//package com.ksun.mrsk.containerbooking.model;
//
//
//import org.springframework.data.cassandra.core.mapping.*;
//
//
//@Table(value = "bookings")
//public class Booking {
//
//    @PrimaryKey
//    private Long id;
//    @Column(value = "container_size")
//    private Integer containerSize;
//    @Column
//    private String origin;
//    @Column
//    private String destination;
//    @Column
//    private Integer quantity;
//    @Column
//    private String timestamp;
//
//    public Booking(Long id, Integer containerSize, String origin, String destination, Integer quantity, String timestamp) {
//        this.id = id; //todo
//        this.containerSize = containerSize;
//        this.origin = origin;
//        this.destination = destination;
//        this.quantity = quantity;
//        this.timestamp = timestamp;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getContainerSize() {
//        return containerSize;
//    }
//
//    public void setContainerSize(Integer containerSize) {
//        this.containerSize = containerSize;
//    }
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public String getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(String timestamp) {
//        this.timestamp = timestamp;
//    }
//}
