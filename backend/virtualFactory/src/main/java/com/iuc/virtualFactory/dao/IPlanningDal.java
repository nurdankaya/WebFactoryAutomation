package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.Planning;

public interface IPlanningDal {
	public void savePlanning(Planning plan);
		
	public List<Planning> getPlanning();
}
