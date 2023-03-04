package com.ksun.mrsk.containerbooking.controller;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.service.ContainerAvailabilityService;
import com.ksun.mrsk.containerbooking.validator.BookingRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.WebExchangeBindException;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/bookings")
public class ContainerController {

    private final ContainerAvailabilityService containerAvailabilityService;

    @Autowired
    public ContainerController(ContainerAvailabilityService containerAvailabilityService) {
        this.containerAvailabilityService = containerAvailabilityService;
    }

    @PostMapping("/test")
    public Mono<AvailableCheck> availableCheck(@Valid @RequestBody BookingRequest bookingRequest){
        return containerAvailabilityService.checkAvailable(bookingRequest);
    }

    @GetMapping("/test")
    public Mono<AvailableCheck> availableCheck1(@Valid @RequestBody BookingRequest bookingRequest){
        return containerAvailabilityService.checkAvailable(bookingRequest);
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(new BookingRequestValidator());
    }

    @ExceptionHandler(WebExchangeBindException.class)
    public ResponseEntity<List<String>> handleException(WebExchangeBindException e) {
        var errors = e.getBindingResult()
                .getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(errors);
    }


}
