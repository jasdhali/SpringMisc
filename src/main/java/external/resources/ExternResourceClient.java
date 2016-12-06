package external.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExternResourceClient {

	public ExternResourceClient() {
	
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/external/resources/externalResourceBeans.xml");
		BannerLoader demo = (BannerLoader)ctx.getBean("bannerLoader");
		System.out.println("Bean Loaded.");
	}
}