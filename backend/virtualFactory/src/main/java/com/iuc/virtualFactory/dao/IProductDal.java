package com.iuc.virtualFactory.dao;

import java.util.List;
import com.iuc.virtualFactory.model.Product;

public interface IProductDal {
	public List<Product> getProducts() ;
	public void saveProduct(Product product);
}
