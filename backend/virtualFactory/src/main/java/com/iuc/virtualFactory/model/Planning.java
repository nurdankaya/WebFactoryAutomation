package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="planning", schema="public")
public class Planning {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE )  
	int id;
	@Column(name="product_id")
	String productId;
	@Column(name="work_center_name")
	String workCenterName;
	
	public Planning() {}
	public Planning(int id, String productId, String workCenterName) {
		super();
		this.id = id;
		this.productId = productId;
		this.workCenterName = workCenterName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getWorkCenterName() {
		return workCenterName;
	}
	public void setWorkCenterName(String workCenterName) {
		this.workCenterName = workCenterName;
	}
	
	
}
