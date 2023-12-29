package com.benediktvitek.ben.repositories;

import com.benediktvitek.ben.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);

    UserEntity getByUsername(String username);
}