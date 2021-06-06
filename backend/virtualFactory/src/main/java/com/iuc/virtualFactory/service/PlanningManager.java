package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IPlanningDal;
import com.iuc.virtualFactory.model.Planning;

@Service
public class PlanningManager implements IPlanningService {

	
	@Autowired
	IPlanningDal planningDal;
	
	
	@Override
	public void savePlanning(Planning plan) {
		planningDal.savePlanning(plan);
	}

	@Override
	public List<Planning> getPlanning() {
		return planningDal.getPlanning();
	}

}
