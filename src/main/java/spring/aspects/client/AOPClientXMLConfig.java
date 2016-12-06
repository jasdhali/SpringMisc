package spring.aspects.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aspects.calculator.ArithmeticCalculator;

public class AOPClientXMLConfig {

	public AOPClientXMLConfig() {
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspects/aspect-beans-xmlconfig.xml");
		if( applicationContext != null ){
			ArithmeticCalculator arithmeticCalculator = 
						(ArithmeticCalculator)applicationContext.getBean("arithmeticCalculator");
			System.out.println("applicationContext Initialized");
			arithmeticCalculator.add(1, 2);
			arithmeticCalculator.add(4, 3);
			arithmeticCalculator.add(2, 3);
			arithmeticCalculator.add(4, 2);
			System.out.println("arithmeticCalculator====> " );
		}
		
	}
}
