package com.ksun.mrsk.containerbooking.controller;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.service.ContainerAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bookings")
public class ContainerController {

    private final ContainerAvailabilityService containerAvailabilityService;

    @Autowired
    public ContainerController(ContainerAvailabilityService containerAvailabilityService) {
        this.containerAvailabilityService = containerAvailabilityService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(@Valid @RequestBody BookingRequest bookingRequest){
        return new ResponseEntity<>(bookingRequest.getContainerSize().toString(), HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity<String> checkAvailable(@Valid @RequestBody BookingRequest bookingRequest) {
        return new ResponseEntity<>(" post", HttpStatus.OK); //containerAvailabilityService.checkAvailable(bookingRequest);
    }


}
