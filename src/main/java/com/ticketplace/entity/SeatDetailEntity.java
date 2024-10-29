package com.ticketplace.entity;

import com.ticketplace.model.enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class SeatDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String seatNo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @Column(nullable = false)
    private double price;

    @ManyToOne()
    @JoinColumn(name = "seatMap_id")
    private SeatMapEntity seatMapEntity;
}