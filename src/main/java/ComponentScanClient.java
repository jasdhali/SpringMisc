import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.sequence.SequenceGenerator;
import com.apress.springrecipes.sequence.SequenceService;

public class ComponentScanClient {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/ComponentScan.xml");
	
	
	public static void main(String[] args) { 	
		SequenceService sequenceService = (SequenceService)context.getBean("sequenceService");
		System.out.println( sequenceService.generate("IT") );
		System.out.println( sequenceService.generate("IT") );
	}
}
