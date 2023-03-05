package com.ksun.mrsk.containerbooking.model.dto;

import java.util.Objects;

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


    @Override
    public String toString() {
        return "BookingResponse{" +
                "bookingRef='" + bookingRef + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingResponse response = (BookingResponse) o;
        return Objects.equals(bookingRef, response.bookingRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingRef);
    }
}
