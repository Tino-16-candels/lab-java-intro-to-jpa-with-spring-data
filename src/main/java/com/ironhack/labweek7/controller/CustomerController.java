package com.ironhack.labweek7.controller;

import com.ironhack.labweek7.model.Customer;
import com.ironhack.labweek7.model.enums.StatusType;
import com.ironhack.labweek7.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    //link to CustomerService
    private final CustomerService customerService;
    //CustomerService constructor
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @RequestMapping("all")
    //get all
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    //retrive data
    @RequestMapping("status/{statusType}")
    public List<Customer> findByStatusType(@PathVariable StatusType statusType) {
        return customerService.findByStatusType(statusType);
    }
}
