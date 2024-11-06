package com.ticketplace.entity;

import com.ticketplace.model.EventCategory;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime dateTime;

    @ManyToOne()
    @JoinColumn(name = "event_cat_id")
    private EventCategoryEntity category;

    @OneToOne
    private TicketPoolEntity ticketPool;




}
