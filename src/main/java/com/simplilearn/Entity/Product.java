package com.simplilearn.Entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	private Long productId;
	private String name;
	private String productType;
	private String category;
	private long basePrice;
	private long discount;
	@ElementCollection
	private Map<String, Long> charges=new HashMap<String, Long>();
	private long finalPrice;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(long basePrice) {
		this.basePrice = basePrice;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public Map<String, Long> getCharges() {
		return charges;
	}
	public void setCharges(Map<String, Long> charges) {
		this.charges = charges;
	}
	public long getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(long finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Product(Long productId, String name, String productType, String category, long basePrice, long discount,
			Map<String, Long> charges, long finalPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.discount = discount;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public void setChargesgst(String string, long gst) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public void setChargesdelivery(String string, long delivery) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
}

