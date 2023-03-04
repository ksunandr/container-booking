package com.ksun.mrsk.containerbooking.service;

class TestDTO {
    public TestDTO() {
    }

    public TestDTO(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    String origin;

    @Override
    public String toString() {
        return "TestDTO{" +
                "origin='" + origin + '\'' +
                '}';
    }
}
