package com.ksun.mrsk.containerbooking.model.dto;

public class BookingResponse {

    String bookingRef;

    public BookingResponse(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public BookingResponse() {
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }
}
