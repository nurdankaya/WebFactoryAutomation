package com.iuc.virtualFactory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IProductDal;
import com.iuc.virtualFactory.model.Product;

@Service
public class ProductManager implements IProductService {

	@Autowired
	IProductDal productDal;
	
	@Override
	public List<Product> getProducts() {
		return productDal.getProducts();
	}
	
	@Override
	public List<Product> getProductSalable() {
		List<Product> p= productDal.getProducts();
		List<Product> result=new ArrayList<Product>();
		for (Product i : p) {
		    if(i.isSalable() == true) {
		    	result.add(i);
		    }
		}
		return result;
	}

	@Override
	public void saveProduct(Product product) {
		productDal.saveProduct(product);
		
	}
}
