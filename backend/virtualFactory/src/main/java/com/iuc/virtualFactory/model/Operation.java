package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operations", schema="public")
public class Operation {

	@Id
	@Column(name="operation_id")
	int operationId;
	
	@Column(name="operation_name")
	String operationName;
	
	@Column(name="product_type")
	String productType;

	
	
	public Operation(int operationId, String operationName, String productType) {
		super();
		this.operationId = operationId;
		this.operationName = operationName;
		this.productType = productType;
	}

	public int getOperationId() {
		return operationId;
	}

	public void setOperationId(int operationId) {
		this.operationId = operationId;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
	
}
