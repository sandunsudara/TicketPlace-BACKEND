package com.ticketplace.controller;

import com.ticketplace.entity.VendorEntity;
import com.ticketplace.model.Admin;
import com.ticketplace.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping
    public VendorEntity save(@RequestBody Admin admin) {
        return adminService.save(admin);

    }

    @GetMapping
    public List<Admin> getAllData(){
        return adminService.getAll();
    }

    @PutMapping
    public VendorEntity update(@RequestBody Admin admin) {
        return adminService.updateEntity(admin);
    }

}
