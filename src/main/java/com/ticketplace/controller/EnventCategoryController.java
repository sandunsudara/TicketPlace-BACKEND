package com.ticketplace.controller;

import com.ticketplace.entity.EventCategoryEntity;
import com.ticketplace.model.EventCategory;
import com.ticketplace.service.EventCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("eventCategory")
public class EnventCategoryController {

    @Autowired
    EventCategoryService eventCategoryService;

    @PostMapping()
    public void save(@RequestBody EventCategory eventCategory) {
        eventCategoryService.save(eventCategory);
    }

    @GetMapping
    public List<EventCategoryEntity> getAll(){
        return eventCategoryService.getAll();
    }
}
