package com.ticketplace.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CustomSeatMapEntiity extends SeatMapEntity {
    private double xPosition;
    private double yPosition;
}
