package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.Product;

@Repository
public interface IProductService {
	List<Product> getProducts();
	List<Product> getProductSalable() ;
	public void saveProduct(Product product);
}
