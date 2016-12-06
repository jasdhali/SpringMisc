package springrecipes.chapter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.shop.Product;

public class FactoryMethodExample {
	public static ApplicationContext context = new ClassPathXmlApplicationContext(
			"springrecipes/chapter02/beans_new.xml");
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Product generator = (Product)context.getBean("cdrw");
		if( generator!=null ){
			System.out.println("generator====>" + generator );
		}
	}
}