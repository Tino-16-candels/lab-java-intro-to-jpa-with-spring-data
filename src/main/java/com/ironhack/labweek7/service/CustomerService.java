package com.ironhack.labweek7.service;

import com.ironhack.labweek7.model.Customer;
import com.ironhack.labweek7.model.enums.StatusType;
import com.ironhack.labweek7.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    //link the server to the model
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    //read all
            public List<Customer> findAll() {
            return customerRepository.findAllByUsingSQL();
         }
    //read by status
    public List<Customer> findByStatusType(StatusType statusType) {
        return customerRepository.findByUsingSQL(statusType);
    }
}