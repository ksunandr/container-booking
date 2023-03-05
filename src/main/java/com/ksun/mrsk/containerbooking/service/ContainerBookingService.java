package com.ksun.mrsk.containerbooking.service;

//import com.ksun.mrsk.containerbooking.model.Booking;
import com.ksun.mrsk.containerbooking.model.Booking;
import com.ksun.mrsk.containerbooking.model.dto.AvailableCheck;
import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.BookingResponse;
import com.ksun.mrsk.containerbooking.model.dto.SpaceAvailabilityResponse;
//import com.ksun.mrsk.containerbooking.repository.BookingRepository;
import com.ksun.mrsk.containerbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ContainerBookingService {

  private BookingRepository bookingRepository;


    public ContainerBookingService() {
    }

    @Autowired
    public ContainerBookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Mono<BookingResponse> book(BookingRequest bookingRequest) {

      Booking booking=  new Booking(null,1, "des", "e", 1, "tt39849yt");

        bookingRepository.save(booking);

        return Mono.just(new BookingResponse("00"));

    }
}
