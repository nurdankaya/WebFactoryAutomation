package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.Product;
import com.iuc.virtualFactory.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@RequestMapping("/salableproducts")
	public List<Product> getProductSalable() {
		return productService.getProductSalable();
	}
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product) {
		 productService.saveProduct(product);
	}
}
