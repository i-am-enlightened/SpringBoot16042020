package com.zensar.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zensar.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
