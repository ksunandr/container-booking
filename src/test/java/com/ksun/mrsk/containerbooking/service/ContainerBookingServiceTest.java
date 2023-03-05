package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.BookingResponse;
import com.ksun.mrsk.containerbooking.model.dto.ContainerType;
import com.ksun.mrsk.containerbooking.model.entity.IdBooking;
import com.ksun.mrsk.containerbooking.repository.BookingRepository;
import com.ksun.mrsk.containerbooking.repository.IdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.mock;

class ContainerBookingServiceTest {

    public static final BookingRequest TEST_BOOKING_REQUEST =
            new BookingRequest(1,
            ContainerType.DRY,
            "test",
            "test",
            1,
            "test");
    ContainerBookingService sut;
    private BookingRepository bookingRepositoryMock;
    private IdRepository idRepositoryMock;


    @BeforeEach
    void initialize() {
        bookingRepositoryMock = mock(BookingRepository.class);
        idRepositoryMock = mock(IdRepository.class);
        sut = new ContainerBookingService(bookingRepositoryMock, idRepositoryMock);
    }

    @Test
    void testBook_firstBooking_BookingResponse957000001() {
        BookingResponse expectedResponse = new BookingResponse("957000001");
        Mockito.when(idRepositoryMock.findById(Mockito.anyString()))
                .thenReturn(Mono.empty());

        StepVerifier.create(sut.book(TEST_BOOKING_REQUEST)).expectNext(expectedResponse).verifyComplete();
    }

    @Test
    void testBook_secondBooking_BookingResponse957000002() {
        BookingResponse expectedResponse = new BookingResponse("957000002");
        Mockito.when(idRepositoryMock.findById(Mockito.anyString()))
                .thenReturn(Mono.just(new IdBooking(957000001, "test")));

        StepVerifier.create(sut.book(TEST_BOOKING_REQUEST)).expectNext(expectedResponse).verifyComplete();
    }
}