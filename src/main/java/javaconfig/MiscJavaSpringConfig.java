package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.springrecipes.bank.AccountDao;
import com.apress.springrecipes.bank.AccountService;
import com.apress.springrecipes.bank.AccountServiceImpl;
import com.apress.springrecipes.bank.InMemoryAccountDao;

@Configuration
public class MiscJavaSpringConfig {

	@Bean
	public AccountDao accountDao(){
		return new InMemoryAccountDao();
	}
	
	@Bean
	public AccountService accountService(){
		return new AccountServiceImpl(accountDao());
	}
	
}
