package com.iuc.virtualFactory.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.iuc.virtualFactory.model.WorkCenterOp;

@Repository
public interface IWorkCenterOpService {
	List<WorkCenterOp> getWcOperations();
	List<WorkCenterOp> getWcOperationsByWcId(int workCenterId);
	List<WorkCenterOp> getWcOperationsByOpId(int operationId);
}
