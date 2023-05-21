package com.osypenko.suppliermonitoringtelegrambot.model.repositories;

import com.osypenko.suppliermonitoringtelegrambot.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}