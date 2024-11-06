package com.ticketplace.service;

import com.ticketplace.entity.VendorEntity;
import com.ticketplace.model.Admin;

import java.util.List;


public interface AdminService {
    VendorEntity save(Admin admin);

    List<Admin> getAll();

    VendorEntity updateEntity(Admin admin);
}
