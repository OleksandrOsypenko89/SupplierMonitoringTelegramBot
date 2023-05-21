package com.osypenko.suppliermonitoringtelegrambot.model.repositories;

import com.osypenko.suppliermonitoringtelegrambot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
