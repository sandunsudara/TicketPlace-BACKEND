package com.ticketplace.entity.ticket;

import com.ticketplace.model.enums.SeatType;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class SeatTicketDetailEntity extends TicketDetailEntity {
    private SeatType seatType;
    private double price;
}
