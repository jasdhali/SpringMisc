package external.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExternalPropertyDemoClient {

	public ExternalPropertyDemoClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//person
		ApplicationContext context = new ClassPathXmlApplicationContext("/external/properties/externalizingProperties.xml");
		ExternalizingPropertyDemo person = (ExternalizingPropertyDemo)context.getBean("person");
		System.out.println("Bean Loaded." + person.toString() );
	}
}
