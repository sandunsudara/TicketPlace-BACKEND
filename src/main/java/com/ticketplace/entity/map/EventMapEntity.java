package com.ticketplace.entity.map;

import com.ticketplace.entity.ticket.TicketDetailEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Data
public class EventMapEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int noTicket;

    @OneToMany(mappedBy = "eventMap")
    private Set<TicketDetailEntity> ticketDetails;

}
