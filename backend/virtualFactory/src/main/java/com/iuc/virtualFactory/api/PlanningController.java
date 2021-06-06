package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.Planning;
import com.iuc.virtualFactory.service.IPlanningService;

@RestController
@RequestMapping("/api")
public class PlanningController {
	
	@Autowired
	IPlanningService planningService;
	
	@RequestMapping("/plan")
	public List<Planning> getPlans() {
		return planningService.getPlanning();
	}
	
	@RequestMapping(value = "/plan",method = RequestMethod.POST)
	public void getPlans(@RequestBody Planning plan) {
		 planningService.savePlanning(plan);
	}
}
