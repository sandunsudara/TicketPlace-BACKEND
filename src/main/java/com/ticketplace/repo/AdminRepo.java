package com.ticketplace.repo;

import com.ticketplace.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AdminRepo extends JpaRepository<VendorEntity, UUID> {

    Optional<VendorEntity> findByUserId(String userId);
}
