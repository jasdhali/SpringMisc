import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.misc.NewPerson;

public class JDBeanCreator {

	public static ApplicationContext context = new ClassPathXmlApplicationContext(
			"/autoWiringBeanExamples.xml");

	public static void main(String[] args) {
		
		NewPerson person = null;
		for (int i = 0; i < 5; i++) {
			person = (NewPerson) context.getBean("newPerson");
			person.setFirstName(" Person No ==> " + (i+1) );
			System.out.println("  Person =====> " + person.toString() );
		}
	}
}