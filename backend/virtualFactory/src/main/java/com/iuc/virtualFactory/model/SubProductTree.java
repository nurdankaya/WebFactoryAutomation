package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="subProductTree", schema="public")
public class SubProductTree {

	@Id
	@Column(name="id")
	int id;
	@Column(name="sub_product_id")
	String subProductId;
	@Column(name="product_id")
	String productId;
	int amount;
	
	public SubProductTree() {}

	public SubProductTree(int id, String subProductId, String productId, int amount) {
		this.id = id;
		this.subProductId = subProductId;
		this.productId = productId;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubProductId() {
		return subProductId;
	}

	public void setSubProductId(String subProductId) {
		this.subProductId = subProductId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
