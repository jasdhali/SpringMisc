package init_methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodClient {

	public InitMethodClient() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/init_methods/initMethodBeans.xml");
		SpringInitMethodDemo demo = (SpringInitMethodDemo)ctx.getBean("initMthdBean");
	}

}
