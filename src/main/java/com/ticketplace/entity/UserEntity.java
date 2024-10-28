package com.ticketplace.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        @Column(name = "id")
        private UUID id;
        @Column(length = 40, nullable = false,unique = true)
        private String userId;
        private String firstName;
        private String lastName;
        @Column(unique = true, nullable = false)
        private String email;
        private String contact;
        @OneToOne(cascade = CascadeType.ALL)
        private LoginDetailEntity loginDetail;
}
