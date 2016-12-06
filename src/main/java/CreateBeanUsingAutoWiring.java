import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.apress.springrecipes.sequence.SequenceGenerator;

public class CreateBeanUsingAutoWiring {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/autoWiringBeanExamples.xml");
	
	@SuppressWarnings("resource")
	public static void main(String[] args) { 	
		SequenceGenerator sequenceGeneratorBean = 
					(SequenceGenerator) context.getBean("sequenceGenerator");
		System.out.println( sequenceGeneratorBean.toString() );
	}
}
