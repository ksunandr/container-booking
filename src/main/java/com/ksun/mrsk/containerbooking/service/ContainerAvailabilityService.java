package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.CheckRequest;
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

    public Mono<AvailableCheck> checkAvailable(CheckRequest checkRequest) {
        return client.post()
                .uri("/api/bookings/checkAvailable")
                .bodyValue(checkRequest)
                .retrieve()
                .bodyToMono(SpaceAvailabilityResponse.class)
                .map(e -> new AvailableCheck(e.getAvailableSpace() > 0));
    }
}
