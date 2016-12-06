import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.apress.springrecipes.sequence.SequenceGenerator;

public class CreateSeqGenUsingBeanInjection {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
	@SuppressWarnings("resource")
	public static void main(String[] args) { 	
		SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("sequenceGenerator_p");
		System.out.println( sequenceGenerator.toString() );
	}
}
