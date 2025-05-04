package com.ironhack.labweek7.repository;

import com.ironhack.labweek7.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
    @Query(value = "SELECT * FROM flight_booking", nativeQuery = true)
    List<FlightBooking> findByUsingSQL();
}
