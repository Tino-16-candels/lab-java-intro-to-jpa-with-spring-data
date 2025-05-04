package com.ironhack.labweek7.repository;

import com.ironhack.labweek7.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository  extends JpaRepository<Flight, Long> {
    @Query(value = "SELECT * FROM flight", nativeQuery = true)
    List<Flight> findByUsingSQL();
}