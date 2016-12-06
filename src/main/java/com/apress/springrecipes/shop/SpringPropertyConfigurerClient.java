package com.apress.springrecipes.shop;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class SpringPropertyConfigurerClient {

	public static ApplicationContext context = new ClassPathXmlApplicationContext("/spring-beans-property-example.xml");

	public static void main(String[] args) {
		PropertySourcesPlaceholderConfigurer propertySources =
					(PropertySourcesPlaceholderConfigurer)context.getBean("discountFactoryConfigurer");
		System.out.println( " propertySources ==> " + propertySources.toString() );
		Battery battery = (Battery) context.getBean("aaa");
		System.out.println("Battery is ====> " + battery.toString() );
		try {
			loadRawResource();
		} catch (IOException e) {
			System.out.println( e.getMessage() );
		}
	}
	
	public static void loadRawResource() throws IOException{
		Resource resource = 
				new ClassPathResource("discounts.properties");
		Properties props =
				PropertiesLoaderUtils.loadProperties(resource);
		System.out.println("And don't forget our discounts.");
		System.out.println(props);
	}
	
}
