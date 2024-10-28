package com.ticketplace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity extends UserEntity {
    @Column(nullable = false, unique = true,name="admin_id")
    private String adminId;
}
