package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingCheckRequest;
import com.ksun.mrsk.containerbooking.model.dto.ContainerType;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

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


        sut = new ContainerAvailabilityService();


    }

    @Test
    void checkAvailable() {
        BookingCheckRequest bookingRequest = new BookingCheckRequest(1, ContainerType.DRY, "", "", 1);
        mockBackEnd.enqueue(new MockResponse()
                .setBody("1=1")
                .addHeader("Content-Type", "application/json"));

        Mono<AvailableCheck> result = sut.checkAvailable(bookingRequest);



        System.out.println(result);

    }
}