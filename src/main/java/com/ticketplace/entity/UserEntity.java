package com.ticketplace.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        @Column(name = "user_id")
        private UUID userId;
        private String firstName;
        private String lastName;
        @Column(unique = true, nullable = false)
        private String email;
        private String contact;
        @OneToOne(cascade = CascadeType.ALL)
        private LoginDetailEntity loginDetail;
}
