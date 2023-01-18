package com.project3.warehousemanager;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project3.warehousemanager.model.InventoryItem;
import com.project3.warehousemanager.repo.InventoryItemRepo;
import com.project3.warehousemanager.service.InventoryService;

@RestController
@RequestMapping("/inventoryItem")
public class InventoryItemResource {
	private final InventoryService inventoryService;

	public InventoryItemResource(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<InventoryItem>> getAllInventoryItems () {
		List<InventoryItem> inventoryItems = inventoryService.findAllItems();
		return new ResponseEntity<>(inventoryItems, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<InventoryItem> getInventoryItemsById (@PathVariable("id") Long id) {
		InventoryItem inventoryItem = inventoryService.findInventoryItemById(id);
		return new ResponseEntity<>(inventoryItem, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<InventoryItem> addInventoryItem(@RequestBody InventoryItem inventoryItem) {
		InventoryItem newInventoryItem = inventoryService.addInventoryItem(inventoryItem);
		return new ResponseEntity<>(newInventoryItem, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<InventoryItem> updateInventoryItem(@RequestBody InventoryItem inventoryItem) {
		InventoryItem updateInventoryItem = inventoryService.updateItem(inventoryItem);
		return new ResponseEntity<>(updateInventoryItem, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteInventoryItem(@PathVariable("id") Long id) {
		inventoryService.deleteItem(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
}
