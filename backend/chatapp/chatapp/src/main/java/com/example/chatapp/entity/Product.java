package com.example.chatapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private Long id;

    private double cost;
    private String category;
    private String name;
    private String brand;
    private double retailPrice;
    private String department;
    private String sku;
    private Long distributionCenterId;

    public Product() {}

    public Product(Long id, double cost, String category, String name, String brand,
                   double retailPrice, String department, String sku, Long distributionCenterId) {
        this.id = id;
        this.cost = cost;
        this.category = category;
        this.name = name;
        this.brand = brand;
        this.retailPrice = retailPrice;
        this.department = department;
        this.sku = sku;
        this.distributionCenterId = distributionCenterId;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Long getDistributionCenterId() {
		return distributionCenterId;
	}

	public void setDistributionCenterId(Long distributionCenterId) {
		this.distributionCenterId = distributionCenterId;
	}

}
