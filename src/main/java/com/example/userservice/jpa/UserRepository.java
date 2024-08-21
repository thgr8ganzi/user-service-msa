package com.example.userservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findAllByUserId(String userId);

    UserEntity findByEmail(String username);
}
