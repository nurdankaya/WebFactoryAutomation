package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IWorkCenterOperationDal;
import com.iuc.virtualFactory.model.WorkCenterOp;

@Service
public class WorkCenterOpManager implements IWorkCenterOpService {

	@Autowired
	IWorkCenterOperationDal wcOpDal;
	
	@Override
	public List<WorkCenterOp> getWcOperations() {
		return wcOpDal.getWcOperations();
	}

	@Override
	public List<WorkCenterOp> getWcOperationsByWcId(int workCenterId) {
		return wcOpDal.getWcOperationsByWcId(workCenterId);
	}

	@Override
	public List<WorkCenterOp> getWcOperationsByOpId(int operationId) {
		return wcOpDal.getWcOperationsByOpId(operationId);
	}

}
