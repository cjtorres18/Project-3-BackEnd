package com.project3.warehousemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project3.warehousemanager.model.InventoryItem;

public interface InventoryItemRepo extends JpaRepository<InventoryItem, Long> {

	void deleteInventoryItemById(Long id);

	InventoryItem findInventoryItemById(Long id);

	

}
