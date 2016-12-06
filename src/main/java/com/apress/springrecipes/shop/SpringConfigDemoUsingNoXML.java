package com.apress.springrecipes.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigDemoUsingNoXML {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext();
		context.register(ProductConfigUtil.class);	
		context.refresh();
		
		Product cdRW = (Disc)context.getBean("CdRw");
		Product dvdRW = (Disc)context.getBean("CdRw");
		/*if( cdRW!=null){
			System.out.println(cdRW);
		}*/
		context.close();
	}
}
