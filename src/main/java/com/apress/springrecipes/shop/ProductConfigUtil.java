package com.apress.springrecipes.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfigUtil {
	
	@Bean(name="CdRw")
	public Product getCdRw(){
		Disc dck = new Disc();
		dck.setName("CD-RW");
		dck.setPrice(1.5d);
		dck.setCapacity(700);
		return dck;
	}
	
	@Bean
	public Product getDvdRw(){
		Disc dck = new Disc();
		dck.setName("DVD-RW");
		dck.setPrice(1.5d);
		dck.setCapacity(800);
		return dck;
	}
	
	@Bean
	public Product getBattery(){
		Battery btry = new Battery();
		btry.setName("CD-RW");
		btry.setPrice( 1.5d );
		btry.setRechargeable( true );
		return btry;
	}
	
	@Bean
	public ShoppingCart getShoppingCart(){
		ShoppingCart shoppingCart = new ShoppingCart();
		return shoppingCart;
	}
}
