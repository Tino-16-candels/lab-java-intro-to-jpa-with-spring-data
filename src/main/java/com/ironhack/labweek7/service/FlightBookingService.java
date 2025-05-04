package com.ironhack.labweek7.service;

import com.ironhack.labweek7.model.FlightBooking;
import com.ironhack.labweek7.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    //link the server to the model
    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {

        this.flightBookingRepository = flightBookingRepository;
    }
    //get all
    public List<FlightBooking> findAll() {
        return flightBookingRepository.findByUsingSQL();
    }
}
