package spring.ws;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JaxWebserviceLauncher {

	public JaxWebserviceLauncher() {	}

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("/spring-ws.xml");
	}
}
