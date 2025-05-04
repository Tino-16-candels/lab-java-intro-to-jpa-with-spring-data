package com.ironhack.labweek7;
//model
import com.ironhack.labweek7.model.Customer;
import com.ironhack.labweek7.model.enums.StatusType;
import com.ironhack.labweek7.model.Flight;
import com.ironhack.labweek7.model.FlightBooking;
//repository
import com.ironhack.labweek7.repository.CustomerRepository;
import com.ironhack.labweek7.repository.FlightRepository;
import com.ironhack.labweek7.repository.FlightBookingRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabWeek7Application {

    public static void main(String[] args) {
        SpringApplication.run(LabWeek7Application.class, args);
    }

    //popolo la tabella customer
    @Bean
    CommandLineRunner run(
            CustomerRepository customerRepository,
            FlightRepository flightRepository,
            FlightBookingRepository flightBookingRepository
    ) {
        return args -> {
            Customer cus1 = customerRepository.save(new Customer("Ebenezer Scrooge", StatusType.GOLD,300582));

            Flight fly1 = flightRepository.save(new Flight("AB123", "Boeing 747", 300, 400));

            FlightBooking boo1 = flightBookingRepository.save(new FlightBooking(cus1.getName(), fly1.getFlight_number()));
        };
    }

}
