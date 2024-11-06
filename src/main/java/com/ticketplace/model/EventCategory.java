package com.ticketplace.model;

import com.ticketplace.entity.EventEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventCategory {
    private String title;
    private String image;
    private Set<EventEntity> events;
}
