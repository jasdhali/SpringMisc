package com.apress.springrecipes.shop;

public class Battery extends Product {
	public boolean rechargeable;
	public Battery() {
		super();
	}
	public Battery(String name, double price) {
		super(name, price);
	}
	public boolean isRechargeable() {
		return rechargeable;
	}
	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	@Override
	public String toString() {
		return "Battery [rechargeable=" + rechargeable + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getDiscount()=" + getDiscount() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
}