package com.osypenko.suppliermonitoringtelegrambot.repositories.interfaces;

import com.osypenko.suppliermonitoringtelegrambot.entityes.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
