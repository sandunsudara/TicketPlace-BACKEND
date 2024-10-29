package com.ticketplace.service;

import com.ticketplace.entity.CustomerEntity;
import com.ticketplace.model.Customer;

import java.util.List;

public interface CustomerService {

    CustomerEntity save(Customer customer);

    List<Customer> getAll();
}
