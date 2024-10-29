package com.ticketplace.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class RoundSeatMapEntity extends SeatMapEntity {

    @Column(nullable = false)
    private int startNoCol;

    @Column(nullable = false)
    private int endNoCol;

    @Column(nullable = false)
    private int noRow;
}
