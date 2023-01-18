package com.project3.warehousemanager.model;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryItem implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String brand;
	private String imageUrl;
	private String barcode;
	
	//constructors
	
	public InventoryItem() {}
	
	public InventoryItem(String name, String brand, String imageUrl, String barcode) {
		this.name = name;
		this.brand = brand;
		this.imageUrl = imageUrl;
		this.barcode = barcode;
	}
	
	// Getters and Setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name=" + name +
				", brand=" + brand +
				" ImageUrl=" + imageUrl +
				"}";
	}
	
	
	
}


