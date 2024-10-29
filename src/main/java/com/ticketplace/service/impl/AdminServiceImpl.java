package com.ticketplace.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticketplace.entity.AdminEntity;
import com.ticketplace.model.Admin;
import com.ticketplace.repo.AdminRepo;
import com.ticketplace.repo.UserRepo;
import com.ticketplace.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
    public AdminEntity save(Admin admin) {
        AdminEntity adminEntity = objectMapper.convertValue(admin, AdminEntity.class);
        return adminRepo.save(adminEntity);
    }

    @Override
    public List<Admin> getAll() {
        return StreamSupport.stream(adminRepo.findAll().spliterator(),false).
                map(adminEntity -> objectMapper.convertValue(adminEntity, Admin.class)).
                collect(Collectors.toList());

    }

    @Override
    public AdminEntity updateEntity(Admin admin) {
        AdminEntity adminEntity = objectMapper.convertValue(admin, AdminEntity.class);
        adminEntity.setId(adminRepo.findByUserId(admin.getUserId()).get().getId());
        return adminRepo.save(adminEntity);
    }
}
