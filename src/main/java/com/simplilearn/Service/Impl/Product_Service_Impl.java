package com.simplilearn.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Product;
import com.simplilearn.Repo.Product_repo;
import com.simplilearn.Service.Product_Service;

@Service
public class Product_Service_Impl implements Product_Service {

	@Autowired
	Product_repo product_repo;
	
	@Override
	public Product addProduct(Product product) {
		
		return product_repo.save(product);
	}

	@Override
	public Product updateProduct(Product product, Long productId) {
		Optional<Product> optionalProduct = product_repo.findById(productId);
		if(optionalProduct.isPresent()) {
			product_repo.save(product);
			return product;
		}
		return null;
	}

	@Override
	public Product deleteProduct(Long productId) {
		Optional<Product> optionalProduct = product_repo.findById(productId);
		if(optionalProduct.isPresent()) {
			product_repo.delete(optionalProduct.get());
		}
		return null;
	}

	@Override
	public List<Product> allProduct() {
		
		return product_repo.findAll();
	}

	@Override
	public Product findById(Long productId) {
		Optional<Product> optinal=product_repo.findById(productId);
		if(optinal.isPresent()) {
			return optinal.get();
		}
		return null;
	}

}
