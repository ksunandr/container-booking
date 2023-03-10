package com.ksun.mrsk.containerbooking.service;

import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.BookingResponse;
import com.ksun.mrsk.containerbooking.model.entity.Booking;
import com.ksun.mrsk.containerbooking.model.entity.IdBooking;
import com.ksun.mrsk.containerbooking.repository.BookingRepository;
import com.ksun.mrsk.containerbooking.repository.IdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ContainerBookingService {

    private final BookingRepository bookingRepository;
    private final IdRepository idRepository;

    @Autowired
    public ContainerBookingService(BookingRepository bookingRepository, IdRepository idRepository) {
        this.bookingRepository = bookingRepository;
        this.idRepository = idRepository;
    }

    public Mono<BookingResponse> book(BookingRequest bookingRequest) {
        return idRepository.findById(IdBooking.ID_NAME)
                .defaultIfEmpty(createInitialId())
                .map(idBooking -> {
                    Booking booking = map(bookingRequest);
                    idBooking.setCurrentId(idBooking.getCurrentId() + 1);
                    booking.setBookingRef(idBooking.getCurrentId());
                    idRepository.save(idBooking);
                    bookingRepository.save(booking);
                    return new BookingResponse(String.valueOf(booking.getBookingRef()));
                });
    }

    private IdBooking createInitialId() {
        return new IdBooking(IdBooking.ID_INITIAL, IdBooking.ID_NAME);
    }

    private Booking map(BookingRequest bookingRequest) {
        return new Booking(bookingRequest.getContainerSize(),
                bookingRequest.getOrigin(),
                bookingRequest.getDestination(),
                bookingRequest.getQuantity(),
                bookingRequest.getTimestamp());
    }
}
