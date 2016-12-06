package spring.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressionLanguageDemo {

	public ExpressionLanguageDemo() {
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext	= new ClassPathXmlApplicationContext("spring/expressionlanguage/expressionlang.xml");
		EmailUtilities emailUtilities = (EmailUtilities)applicationContext.getBean("emailUtilities");
		System.out.println("emailUtilities=======>" + emailUtilities.toString() );
	}
}