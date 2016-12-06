import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.apress.springrecipes.sequence.SequenceGenerator;

public class BeanCreatorOne {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		
		// loading the definitions from the given XML file		 
		//SequenceGenerator service = (SequenceGenerator) context.getBean("sequenceGenerator");
		//System.out.println( service.getSequence() );
		//System.out.println( service.getSequence() );
		
		//(new BeanCreatorOne()).getBeanUsingXMLConsArgs();
		(new BeanCreatorOne()).getBeanUsingShortcut();
		//(new BeanCreatorOne()).getBeanUsingConstructorArgShortcut();
		
		//(new BeanCreatorOne()).getBeanUsingPSchema();
		
		
	}
	
	public void getBeanUsingXMLConsArgs() { 
		SequenceGenerator service1 = (SequenceGenerator) context.getBean("seqGenerator_1");
		System.out.println( service1.getSequence() );
		System.out.println( service1.getSequence() );		
	}
	
	/**
	 * Example using shortcut method of bean instantiation.
	*/	
	public void getBeanUsingShortcut() { 
		SequenceGenerator service2 = (SequenceGenerator) context.getBean("seqGenerator_2");
		System.out.println( service2.getSequence() );
		System.out.println( service2.getSequence() );		
	}
	
	/**
	 * Example creating a spring bean that is created by using constructor argument name and value pair. 
	*/
	public void getBeanUsingConstructorArgShortcut() { 
		SequenceGenerator service3 = (SequenceGenerator) context.getBean("seqGenerator_3");
		System.out.println( service3.getSequence() );
		System.out.println( service3.getSequence() );		
	}
	
	/**
	 * Example creating a spring bean using p schema. 
	*/
	public void getBeanUsingPSchema() { 
		SequenceGenerator service = (SequenceGenerator) context.getBean("seqGenerator_4");
		System.out.println( service.getSequence() );
		System.out.println( service.getSequence() );		
	}
	
	
}
