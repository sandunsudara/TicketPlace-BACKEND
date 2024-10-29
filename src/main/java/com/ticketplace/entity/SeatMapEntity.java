package com.ticketplace.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class SeatMapEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private int noSeat;
    @OneToMany(mappedBy = "seatMapEntity")
    private List<SeatDetailEntity> seatDetails;

}
