package com.ticketplace.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticketplace.entity.VendorEntity;
import com.ticketplace.model.Admin;
import com.ticketplace.repo.AdminRepo;
import com.ticketplace.repo.UserRepo;
import com.ticketplace.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    ObjectMapper objectMapper;


    @Override
    public VendorEntity save(Admin admin) {
        VendorEntity vendorEntity = objectMapper.convertValue(admin, VendorEntity.class);
        return adminRepo.save(vendorEntity);
    }

    @Override
    public List<Admin> getAll() {
        return StreamSupport.stream(adminRepo.findAll().spliterator(),false).
                map(vendorEntity -> objectMapper.convertValue(vendorEntity, Admin.class)).
                collect(Collectors.toList());

    }

    @Override
    public VendorEntity updateEntity(Admin admin) {
        VendorEntity vendorEntity = objectMapper.convertValue(admin, VendorEntity.class);
        vendorEntity.setId(adminRepo.findByUserId(admin.getUserId()).get().getId());
        return adminRepo.save(vendorEntity);
    }
}
