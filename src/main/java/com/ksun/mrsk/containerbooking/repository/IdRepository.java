package com.ksun.mrsk.containerbooking.repository;

import com.ksun.mrsk.containerbooking.model.entity.IdBooking;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdRepository extends ReactiveCassandraRepository<IdBooking, String> {
}
