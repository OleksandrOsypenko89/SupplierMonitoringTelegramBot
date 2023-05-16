package com.osypenko.suppliermonitoringtelegrambot.repositories.interfaces;

import com.osypenko.suppliermonitoringtelegrambot.entityes.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
