package com.ksun.mrsk.containerbooking.model.dto;

import java.io.Serializable;

public class AvailableCheck  {

    private String origin;

    public AvailableCheck() {
        super();
    }


    public AvailableCheck(String available) {
        super(); this.origin = available;
    }

    public String isOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "AvailableCheck{" +
                "origin='" + origin + '\'' +
                '}';
    }
}
