package com.ticketplace.service;

import com.ticketplace.entity.AdminEntity;
import com.ticketplace.model.Admin;

import java.util.List;


public interface AdminService {
    AdminEntity save(Admin admin);

    List<Admin> getAll();

    AdminEntity updateEntity(Admin admin);
}
