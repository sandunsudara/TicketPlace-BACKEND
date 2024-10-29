package com.ticketplace.controller;

import com.ticketplace.entity.CustomerEntity;
import com.ticketplace.model.Customer;
import com.ticketplace.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public CustomerEntity save (@RequestBody Customer customer) {
        return customerService.save(customer);

    }

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }
}
