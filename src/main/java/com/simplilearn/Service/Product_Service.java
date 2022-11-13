package com.simplilearn.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Product;

@Service
public interface Product_Service {
	Product addProduct(Product product);
	Product updateProduct(Product product, Long productId);
	Product deleteProduct(Long productId);
	List<Product> allProduct();
	Product findById(Long productId);
}
