package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingCheckRequest;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.ContainerType;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.io.IOException;

class ContainerAvailabilityServiceTest {

    public static MockWebServer mockBackEnd;
    public ContainerAvailabilityService sut;

    @BeforeAll
    static void setUp() throws IOException {
        mockBackEnd = new MockWebServer();
        mockBackEnd.start();
    }

    @AfterAll
    static void tearDown() throws IOException {
        mockBackEnd.shutdown();
    }

    @BeforeEach
    void initialize() {
        String baseUrl = String.format("http://localhost:%s",
                mockBackEnd.getPort());

       sut = new ContainerAvailabilityService(WebClient.create(baseUrl));
    }

    @Test
    void testCheckAvailable_availableSpace0_false() {

        mockBackEnd.enqueue(new MockResponse()
                .setBody("{\"availableSpace\": 0}")
                .addHeader("Content-Type", "application/json"));

        Mono<AvailableCheck> response = sut.checkAvailable(new BookingCheckRequest());

        StepVerifier.create(response)
                .expectNextMatches(availableCheck -> !availableCheck.isAvailable())
                .verifyComplete();
    }

    @Test
    void testCheckAvailable_availableSpace6_true() {

        mockBackEnd.enqueue(new MockResponse()
                .setBody("{\"availableSpace\": 6}")
                .addHeader("Content-Type", "application/json"));

        Mono<AvailableCheck> response = sut.checkAvailable(new BookingCheckRequest());

        StepVerifier.create(response)
                .expectNextMatches(AvailableCheck::isAvailable)
                .verifyComplete();

    }
}