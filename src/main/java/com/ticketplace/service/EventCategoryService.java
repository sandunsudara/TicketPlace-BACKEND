package com.ticketplace.service;

import com.ticketplace.entity.EventCategoryEntity;
import com.ticketplace.model.EventCategory;

import java.util.List;

public interface EventCategoryService {
    EventCategoryEntity save(EventCategory eventCategory);

    List<EventCategoryEntity> getAll();
}
