package com.simplilearn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.Product;
import com.simplilearn.Service.Product_Service;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	Product_Service product_service;
@PostMapping("/add")
Product addProduct(@RequestBody Product product) {
	if(product.getCategory().equalsIgnoreCase("Electronics")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(15*baseprice/100);
		long gst=(long)(18*(baseprice-discount)/100);
		long delivery=350;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Home Appliances")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(22*baseprice/100);
		long gst=(long)(24*(baseprice-discount)/100);
		long delivery=800;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Clothing")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(40*baseprice/100);
		long gst=(long)(12*(baseprice-discount)/100);
		long delivery=0;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Furniture")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(10*baseprice/100);
		long gst=(long)(18*(baseprice-discount)/100);
		long delivery=300;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	return product_service.addProduct(product);
	
}
@GetMapping("/all")
 List<Product> findAll() {
	return  product_service.allProduct();
	
}
@GetMapping("/id/{productId}")
Product findById(@PathVariable Long productId) {
	return  product_service.findById(productId);
	
}
@PutMapping("/update/{productId}")
 Product updateProduct( @RequestBody Product product, @PathVariable Long productId ) {
	if(product.getCategory().equalsIgnoreCase("Electronics")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(15*baseprice/100);
		long gst=(long)(18*(baseprice-discount)/100);
		long delivery=350;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Home Appliances")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(22*baseprice/100);
		long gst=(long)(24*(baseprice-discount)/100);
		long delivery=800;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Clothing")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(40*baseprice/100);
		long gst=(long)(12*(baseprice-discount)/100);
		long delivery=0;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	else if(product.getCategory().equalsIgnoreCase("Furniture")) {
		long baseprice=product.getBasePrice();
		long discount=(long)(10*baseprice/100);
		long gst=(long)(18*(baseprice-discount)/100);
		long delivery=300;
		long finalprice=(baseprice-discount+gst+delivery);
		product.setFinalPrice(finalprice);
		product.setDiscount(discount);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("gst", gst);
		map.put("delivery", delivery);
		product.setCharges(map);
	}
	return product_service.updateProduct(product, productId);
	
}
@DeleteMapping("/delete/{productId}")
Product deleteProduct(@PathVariable Long productId) {
	return product_service.deleteProduct(productId);
	
}
}
