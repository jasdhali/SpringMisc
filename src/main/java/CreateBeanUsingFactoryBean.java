import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.sequence.SequenceGenerator;
import com.apress.springrecipes.shop.DiscountFactoryBean;

public class CreateBeanUsingFactoryBean {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
	@SuppressWarnings("resource")
	public static void main(String[] args) { 	
		DiscountFactoryBean discountFactoryBean = (DiscountFactoryBean) context.getBean("aaa");
		System.out.println( discountFactoryBean.toString() );
	}
}
