package com.apress.springrecipes.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Product> items = new ArrayList<Product>();
	public void addItem(Product prod){
		items.add(prod);
	}
	
	public List<Product> getItems(){
		return items;
	}
}
