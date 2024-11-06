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
public class VendorEntity extends UserEntity {
    @Column(nullable = false, unique = true)
    private String vendorId;
}
