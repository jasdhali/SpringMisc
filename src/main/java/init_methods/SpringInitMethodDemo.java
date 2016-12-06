package init_methods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringInitMethodDemo {

	public SpringInitMethodDemo() {
	}

	@PostConstruct
	public void methodA() {
		System.out.println("methodA() =====>  @PostConstruct");
	}

	public String getHello() {
		return "hello";
	}

	@PreDestroy
	public void methodB() {
		System.out.println("methodB()====>  @PreDestroy");
	}

}
