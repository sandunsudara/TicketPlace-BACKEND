package com.ticketplace.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "login_detail")
public class LoginDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

}
