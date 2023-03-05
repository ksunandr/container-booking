package com.ksun.mrsk.containerbooking.repository;

import com.ksun.mrsk.containerbooking.model.entity.Booking;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends ReactiveCassandraRepository<Booking, Long> {
}
