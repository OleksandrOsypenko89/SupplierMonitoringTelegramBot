package com.osypenko.suppliermonitoringtelegrambot.repositories.interfaces;

import com.osypenko.suppliermonitoringtelegrambot.entityes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}