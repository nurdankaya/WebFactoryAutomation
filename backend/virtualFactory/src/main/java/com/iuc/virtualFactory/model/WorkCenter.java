package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="workcenters", schema="public")
public class WorkCenter {
	
	@Id
	@Column(name="work_center_id")
	int wcId;
	
	@Column(name="work_center_name")
	String wcName;
	
	boolean active;

	public WorkCenter() {}
	public WorkCenter(int wcId, String wcName, boolean active) {
		super();
		this.wcId = wcId;
		this.wcName = wcName;
		this.active = active;
	}

	public int getWcId() {
		return wcId;
	}

	public void setWcId(int wcId) {
		this.wcId = wcId;
	}

	public String getWcName() {
		return wcName;
	}

	public void setWcName(String wcName) {
		this.wcName = wcName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
