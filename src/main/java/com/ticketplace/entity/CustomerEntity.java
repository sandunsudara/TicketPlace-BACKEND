package com.ticketplace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CustomerEntity extends UserEntity{
    @Column(unique = true,name = "customer_id")
    private String customerId;
    private boolean isVip;
    private String address;
}
