package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingCheckRequest;


import com.ksun.mrsk.containerbooking.model.dto.SpaceAvailabilityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class ContainerAvailabilityService {

    private final WebClient client;

    @Autowired
    public ContainerAvailabilityService(WebClient webClient) {
        this.client = webClient;
    }

    public Mono<AvailableCheck> checkAvailable(BookingCheckRequest bookingRequest) {
        return client.post()
                .uri("/api/bookings/checkAvailable")
                .retrieve()
                .bodyToMono(SpaceAvailabilityResponse.class)
                .map(e -> new AvailableCheck(e.getAvailableSpace() > 0));


//          return Mono.just(new SpaceAvailabilityResponse(0))
//                  .map(e -> new AvailableCheck(e.getAvailableSpace()>0));


    }
}
