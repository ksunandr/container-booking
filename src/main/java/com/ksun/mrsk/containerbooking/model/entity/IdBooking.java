package com.ksun.mrsk.containerbooking.model.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table(value = "id_incrementer")
public class IdBooking {

    public static final String id_name = "id_booking_incrementer";
    public static final int id_initial = 957000000;

    @PrimaryKey("nextId")
    private int currentId;

    @Column(value = "id_name")
    private String idName ;

    public IdBooking() {
    }

    public IdBooking(int nextId, String idName) {
        this.currentId = nextId;
        this.idName = idName;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}
