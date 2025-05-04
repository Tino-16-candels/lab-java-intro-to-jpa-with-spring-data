package com.ironhack.labweek7.service;

import com.ironhack.labweek7.model.Flight;
import com.ironhack.labweek7.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
        //link the server to the model
        private final FlightRepository flightRepository;

        public FlightService(FlightRepository flightRepository) {

            this.flightRepository = flightRepository;
        }
        //get all
        public List<Flight> findAll() {
            return flightRepository.findByUsingSQL();
        }
}
