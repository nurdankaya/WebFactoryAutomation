package com.iuc.virtualFactory.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
@Entity
@Table(name="products", schema="public")
public class Product {
	
	@Id
	@Column(name="product_id")
	String productId;
	
	@Column(name="product_name")
	String productName;
	
	@Column(name="product_type")
	String productType;
	
	@Column(name="is_salable")
	boolean isSalable;

	public Product() {};
	
	public Product(String productId, String productName, String productType, boolean isSalable) {
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.isSalable = isSalable;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public boolean isSalable() {
		return isSalable;
	}

	public void setSalable(boolean isSalable) {
		this.isSalable = isSalable;
	}
	
	
	
}
