package com.ticketplace.entity;

import com.ticketplace.entity.ticket.TicketDetailEntity;
import com.ticketplace.model.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private TicketDetailEntity ticketDetail;

    @ManyToOne(fetch = FetchType.EAGER)
    private TicketPoolEntity ticketPool;


    private Status status;
}
