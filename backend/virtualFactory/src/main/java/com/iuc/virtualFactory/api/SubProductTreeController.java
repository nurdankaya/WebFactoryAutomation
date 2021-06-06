package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.SubProductTree;
import com.iuc.virtualFactory.service.ISubProductTreeService;

@RestController 
@RequestMapping("/api")
public class SubProductTreeController {

	@Autowired
	ISubProductTreeService subProductTreeService;
	
	@RequestMapping("/subProductTree")
	public List<SubProductTree> getSubProductTree() {
		return subProductTreeService.getSubProductTree();
	}
	
	@RequestMapping("/subProductTree/{productId}")
	public List<SubProductTree> getSubProductTreeByProductId(@PathVariable("productId") String productId) {
		return subProductTreeService.getSubProductTreeByProductId(productId);
	}
	
}
