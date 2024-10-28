package com.ticketplace.repo;

import com.ticketplace.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepo extends JpaRepository<UserEntity, UUID> {
}
