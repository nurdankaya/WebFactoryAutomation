package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.WorkCenterOp;

public interface IWorkCenterOperationDal {
	List<WorkCenterOp> getWcOperations();
	List<WorkCenterOp> getWcOperationsByWcId(int workCenterId);
	List<WorkCenterOp> getWcOperationsByOpId(int operationId);
}
