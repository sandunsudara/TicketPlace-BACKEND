package com.ticketplace.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticketplace.entity.CustomerEntity;
import com.ticketplace.model.Customer;
import com.ticketplace.repo.CustomerRepo;
import com.ticketplace.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public CustomerEntity save(Customer customer) {
        return customerRepo.save(objectMapper.convertValue(customer, CustomerEntity.class));

    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll().stream().
                map(customerEntity -> objectMapper.convertValue(customerEntity, Customer.class))
                .collect(Collectors.toList());
    }


}
