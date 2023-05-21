package com.osypenko.suppliermonitoringtelegrambot.model.repositories;

import com.osypenko.suppliermonitoringtelegrambot.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
