import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.sequence.SequenceGenerator;

/**
 * 
 */

/**
 * @author jaspal
 *
 */
public class ConstructorOverloadingCheck {

	/**
	 * 
	 */
	public ConstructorOverloadingCheck() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		SequenceGenerator generator = (SequenceGenerator)applicationContext.getBean("sequenceGenerator");
		System.out.println("generator=======>" + generator.toString());
	}

}
