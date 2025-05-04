package com.ironhack.labweek7.controller;

import com.ironhack.labweek7.model.FlightBooking;
import com.ironhack.labweek7.service.FlightBookingService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/booking")
public class FlightBookingController {
    //link to CustomerService
    private final FlightBookingService flightBookingService;
    //CustomerService constructor
    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }
    //retrive data
    @RequestMapping("bookings")
    public List<FlightBooking> findAll() {
        return flightBookingService.findAll();
    }
}
