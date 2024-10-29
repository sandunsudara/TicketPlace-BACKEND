package com.ticketplace.repo;

import com.ticketplace.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, UUID> {
}
