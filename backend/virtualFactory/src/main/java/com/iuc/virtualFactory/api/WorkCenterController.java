package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.WorkCenter;
import com.iuc.virtualFactory.service.IWorkCenterService;

@RestController
@RequestMapping("/api")
public class WorkCenterController {

		@Autowired
		IWorkCenterService workCenterService;
		
		@RequestMapping("/workCenters")
		public List<WorkCenter> getWorkCenters(){
			return workCenterService.getWorkCenters();
		}
}
