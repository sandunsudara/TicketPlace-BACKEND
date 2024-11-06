package com.ticketplace.repo;

import com.ticketplace.entity.EventCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventCategoryRepo extends JpaRepository<EventCategoryEntity, UUID> {
}
