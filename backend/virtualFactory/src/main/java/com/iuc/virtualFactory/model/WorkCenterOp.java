package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="workcenteroperation", schema="public")
public class WorkCenterOp {
	
	@Id
	@Column(name="wc_opr_id")
	int wcOprId;
	@Column(name="work_center_id")
	int wcID;
	@Column(name="operation_id")
	int operationId;
	
	int speed;

	public WorkCenterOp() {}
	public WorkCenterOp(int wcOprId, int wcID, int operationId, int speed) {
		super();
		this.wcOprId = wcOprId;
		this.wcID = wcID;
		this.operationId = operationId;
		this.speed = speed;
	}

	public int getWcOprId() {
		return wcOprId;
	}

	public void setWcOprId(int wcOprId) {
		this.wcOprId = wcOprId;
	}

	public int getWcID() {
		return wcID;
	}

	public void setWcID(int wcID) {
		this.wcID = wcID;
	}

	public int getOperationId() {
		return operationId;
	}

	public void setOperationId(int operationId) {
		this.operationId = operationId;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
}
