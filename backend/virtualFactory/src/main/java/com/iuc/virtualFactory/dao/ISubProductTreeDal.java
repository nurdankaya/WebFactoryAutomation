package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.SubProductTree;

public interface ISubProductTreeDal {
	public List<SubProductTree> getSubProductTree();
	public List<SubProductTree> getSubProductTreeByProductId(String productId);
	
}
