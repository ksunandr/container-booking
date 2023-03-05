package com.ksun.mrsk.containerbooking.model.dto;

public class AvailableCheck   {

    private boolean available;

    public AvailableCheck(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
