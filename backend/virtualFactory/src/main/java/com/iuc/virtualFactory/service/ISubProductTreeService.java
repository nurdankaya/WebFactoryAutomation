package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.SubProductTree;

@Repository
public interface ISubProductTreeService {
	
	public List<SubProductTree> getSubProductTree();
	public List<SubProductTree> getSubProductTreeByProductId(String productId);
}
