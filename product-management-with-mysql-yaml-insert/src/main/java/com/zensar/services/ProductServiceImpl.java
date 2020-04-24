package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zensar.Repository.ProductRepository;
import com.zensar.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}

	public Product getProduct(int productId) {
		return repository.findById(productId).get();	//2.2.6.RELEASE
		//return repository.findOne(productId);			//1.5.4.RELEASE
	}

	public void deleteProduct(int productId) {
		repository.deleteById(productId);	//2.2.6.RELEASE
		//repository.delete(productId);		//1.5.4.RELEASE
	}

	public Product insertProduct(Product product) {
		return repository.save(product);
	}

	public Product updateProduct(int productId, Product product) {
		return repository.save(product);
	}
}
