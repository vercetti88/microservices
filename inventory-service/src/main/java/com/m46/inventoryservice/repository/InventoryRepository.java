package com.m46.inventoryservice.repository;

import com.m46.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    public boolean existsInventoryBySkuCode(String skuCode);
}
