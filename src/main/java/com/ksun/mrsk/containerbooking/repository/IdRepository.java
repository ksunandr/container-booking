package com.ksun.mrsk.containerbooking.repository;

import com.ksun.mrsk.containerbooking.model.IdBooking;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdRepository extends ReactiveCassandraRepository<IdBooking, String> {
}
