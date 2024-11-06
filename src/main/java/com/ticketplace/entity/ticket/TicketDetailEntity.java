package com.ticketplace.entity.ticket;

import com.ticketplace.entity.map.EventMapEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class TicketDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String ticketNo;

    @ManyToOne
    private EventMapEntity eventMap;
}
