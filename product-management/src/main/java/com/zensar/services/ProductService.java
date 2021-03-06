package com.zensar.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entities.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public Product deleteProduct(int productId);
	
	public void insertProduct(Product product);
	
	public Product updateProduct(int productId,Product product);
}
