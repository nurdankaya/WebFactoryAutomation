package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.WorkCenter;

@Repository
public interface IWorkCenterService {
	List<WorkCenter> getWorkCenters();
}
