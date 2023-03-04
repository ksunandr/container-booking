package com.ksun.mrsk.containerbooking.controller;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.service.ContainerAvailabilityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/bookings/")
public class ContainerController {

    private final ContainerAvailabilityService containerAvailabilityService;

    public ContainerController(ContainerAvailabilityService containerAvailabilityService) {
        this.containerAvailabilityService = containerAvailabilityService;
    }

    @PostMapping
    public Mono<AvailableCheck> checkAvailable(BookingRequest bookingRequest) {

        return containerAvailabilityService.checkAvailable(bookingRequest);
    }


}
