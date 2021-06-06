package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.ISubProductTreeDal;
import com.iuc.virtualFactory.model.SubProductTree;

@Service
public class SubProductTreeManager implements ISubProductTreeService {

	@Autowired
	ISubProductTreeDal subProductTreeDal;
	
	@Override
	public List<SubProductTree> getSubProductTree() {
		return subProductTreeDal.getSubProductTree();
	}

	@Override
	public List<SubProductTree> getSubProductTreeByProductId(String productId) {
		return subProductTreeDal.getSubProductTreeByProductId(productId);
	}

}
