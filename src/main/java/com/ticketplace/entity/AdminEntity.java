package com.ticketplace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class AdminEntity extends UserEntity {
    @Column(nullable = false, unique = true,name="admin_id")
    private String adminId;
}
