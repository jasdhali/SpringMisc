package com.apress.springrecipes.shop;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class DiscountFactoryBean extends AbstractFactoryBean {

	private Product product;
	private double discount;

	@Override
	protected Object createInstance() throws Exception {
		product.setPrice( product.getPrice() * (1- discount) );
		return null;
	}

	@Override
	public Class getObjectType() {
		return product.getClass();
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
