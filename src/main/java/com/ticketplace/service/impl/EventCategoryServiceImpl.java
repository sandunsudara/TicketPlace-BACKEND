package com.ticketplace.service.impl;

import com.ticketplace.entity.EventCategoryEntity;
import com.ticketplace.model.EventCategory;
import com.ticketplace.repo.EventCategoryRepo;
import com.ticketplace.service.EventCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventCategoryServiceImpl implements EventCategoryService {

    @Autowired
    EventCategoryRepo eventCategoryRepo;

    @Override
    public EventCategoryEntity save(EventCategory eventCategory) {
        return eventCategoryRepo.save(new EventCategoryEntity(null, eventCategory.getTitle(), eventCategory.getImage(),eventCategory.getEvents()));
    }

    @Override
    public List<EventCategoryEntity> getAll() {
        return eventCategoryRepo.findAll();
    }
}
