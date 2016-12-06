package bean_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.springrecipes.misc.Person;

@Configuration
public class PersonConfiguration {

	public PersonConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean( name= "josh" )
	public Person josh(){
		Person josh = new Person();
		josh.setFirstName("josh");
		return josh;
	}

}
