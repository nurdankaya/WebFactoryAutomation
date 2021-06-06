package com.iuc.virtualFactory.service;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.Planning;

@Repository
public interface IPlanningService {
	public void savePlanning(Planning plan);
	
	public List<Planning> getPlanning();
}
