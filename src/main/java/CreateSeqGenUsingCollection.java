import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.apress.springrecipes.sequence.SequenceGenerator;

public class CreateSeqGenUsingCollection {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
	@SuppressWarnings("resource")
	public static void main(String[] args) { 	
		SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("sequenceGenerator_collect");
		System.out.println( sequenceGenerator.toString() );
	}
}
