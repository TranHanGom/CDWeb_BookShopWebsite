package com.cdweb.model;

import com.cdweb.entity.Product;

public class Item {
	private Product product;

	private int quantity;

	public Item() {
		
	}

	public Item(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
	
}
