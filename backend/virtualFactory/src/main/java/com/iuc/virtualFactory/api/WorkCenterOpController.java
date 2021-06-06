package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.WorkCenterOp;
import com.iuc.virtualFactory.service.IWorkCenterOpService;

@RestController
@RequestMapping("/api")
public class WorkCenterOpController {
	
	@Autowired
	IWorkCenterOpService wcOpService;
	
	@RequestMapping("/workCenterOp")
	public List<WorkCenterOp> getWorkCenterOp(){
		return wcOpService.getWcOperations();
	}
	
	@RequestMapping("/workCenterOpr/{workCenterId}")
	public List<WorkCenterOp> getWcOperationsByWcId(@PathVariable("workCenterId") int workCenterId){
		return wcOpService.getWcOperationsByWcId(workCenterId);
	}
	@RequestMapping("/wcOpByOperationId/{operationId}")
	public List<WorkCenterOp> getWcOperationsByOpId(@PathVariable("operationId") int operationId){
		return wcOpService.getWcOperationsByOpId(operationId);
	}
	
}
