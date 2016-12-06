package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class SpringPropertyConfigurerClient {

	public static ApplicationContext context = new ClassPathXmlApplicationContext("/spring-beans-property-example.xml");

	public static void main(String[] args) {
		PropertySourcesPlaceholderConfigurer propertySources =
					(PropertySourcesPlaceholderConfigurer)context.getBean("discountFactoryConfigurer");
		System.out.println( " propertySources ==> " + propertySources.toString() );
		Battery battery = (Battery) context.getBean("aaa");
		System.out.println("Battery is ====> " + battery.toString() );
	}
	
}
