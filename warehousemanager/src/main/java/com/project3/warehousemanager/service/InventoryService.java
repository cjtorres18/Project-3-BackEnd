package com.project3.warehousemanager.service;

import com.project3.warehousemanager.repo.InventoryItemRepo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project3.warehousemanager.model.InventoryItem;

@Service
public class InventoryService {
	private final InventoryItemRepo inventoryItemRepo;
	
	@Autowired
	public InventoryService(InventoryItemRepo inventoryItemRepo) {
		this.inventoryItemRepo = inventoryItemRepo;
	}
	
	public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
		inventoryItem.setBarcode(UUID.randomUUID().toString());
		return inventoryItemRepo.save(inventoryItem);
		
	}
	
	public List<InventoryItem> findAllItems() {
		return inventoryItemRepo.findAll();
	}
	
	public InventoryItem updateItem(InventoryItem inventoryItem) {
		return inventoryItemRepo.save(inventoryItem);
	}
	
	public InventoryItem findInventoryItemById(Long id) {
		return inventoryItemRepo.findInventoryItemById(id);
	}
	
	public void deleteItem(Long id) {
		inventoryItemRepo.deleteInventoryItemById(id);
	}
	
	
}
