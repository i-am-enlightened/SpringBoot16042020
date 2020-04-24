package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	//@RequestMapping("/")
	@GetMapping("/")
	public Iterable<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	//@RequestMapping("/{productId}")
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		return service.getProduct(productId);
	}

	//@RequestMapping(value="/{productId}",method=RequestMethod.DELETE)
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId")int productId) {
		service.deleteProduct(productId);
	}
	
	//@RequestMapping(value="/",method=RequestMethod.POST)
	@PostMapping("/")
	public Product insertProduct(@RequestBody Product product) {
		return service.insertProduct(product);
	}
	
	//@RequestMapping(value="/{productId}", method=RequestMethod.PUT)
	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable("productId")int productId,Product product) {
		return service.updateProduct(productId, product);
	}
	
}	