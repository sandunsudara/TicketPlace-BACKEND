package com.ticketplace.repo;

import com.ticketplace.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, UUID> {

    Optional<AdminEntity> findByUserId(String userId);
}
