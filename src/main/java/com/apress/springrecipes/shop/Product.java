package com.apress.springrecipes.shop;

public abstract class Product {
	private String name;
	private double price;
	private float discount;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Product() {
		super();
	}

	public double getPrice() {
		return price;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}

	
	
}
