package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;

//import jakarta.annotation.PostConstruct;
import com.ksun.mrsk.containerbooking.model.dto.SpaceAvailabilityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@Component
public class ContainerAvailabilityService {

    private final WebClient client;

    @Autowired
    public ContainerAvailabilityService() {
        this.client = WebClient.create("https://httpbin.org/");
        ;
    }

    public Mono<AvailableCheck> checkAvailable(BookingRequest bookingRequest) {


//        WebClient client = WebClient.create("https://www.maersk.com");
//        Mono<SpaceAvailabilityResponse> spaceAvailabilityMono = client.post()
//                .uri("/api/bookings/checkAvailable")
//                .retrieve()
//                .bodyToMono(SpaceAvailabilityResponse.class);
//
//        spaceAvailabilityMono.subscribe(System.out::println);


//        Mono<SpaceAvailabilityResponse> testResponse = client.get()
//                .uri("/ip")
//                .retrieve()
//                .bodyToMono(SpaceAvailabilityResponse.class);
//

        return  Mono.just(new SpaceAvailabilityResponse(1)).map(e -> new AvailableCheck(e.getAvailableSpace()>0));





    }


    @PostConstruct
    public void a() {
        checkAvailable(null);
    }


}
