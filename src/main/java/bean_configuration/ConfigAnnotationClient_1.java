package bean_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.misc.Person;

public class ConfigAnnotationClient_1 {

	public ConfigAnnotationClient_1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext();
		config.register(PersonConfiguration.class);
		String[] beanNameArray = config.getBeanDefinitionNames();
		if( beanNameArray != null ){
			for (int i = 0; i < beanNameArray.length; i++) {
				System.out.println("Bean # => " + i + " - " + beanNameArray[i] );
			}
		}
		Person person = config.getBean("josh" , Person.class );
		if(person!=null){
			System.out.println("person found ====> " + person.toString() );
		}
	}
}