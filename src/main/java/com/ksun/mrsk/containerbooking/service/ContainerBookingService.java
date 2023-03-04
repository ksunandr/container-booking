package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.BookingResponse;
import com.ksun.mrsk.containerbooking.model.dto.SpaceAvailabilityResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ContainerBookingService {

    public ContainerBookingService() {
    }

    public Mono<BookingResponse> book(BookingRequest bookingRequest) {

        return Mono.just(new BookingResponse("00"));

    }
}
