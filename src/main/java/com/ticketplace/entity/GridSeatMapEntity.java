package com.ticketplace.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class GridSeatMapEntity extends SeatMapEntity {
    private int noRow;
    private int noCol;
}
