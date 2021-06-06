package com.iuc.virtualFactory.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IWorkCenterDal;
import com.iuc.virtualFactory.model.WorkCenter;

@Service
public class WorkCenterManager implements IWorkCenterService {

	@Autowired
	IWorkCenterDal workCenterDal;
	
	@Override
	public List<WorkCenter> getWorkCenters() {
		return workCenterDal.getWorkCenters();
	}

}
