package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.bank.AccountDao;
import com.apress.springrecipes.bank.AccountService;

public class JavaConfigClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MiscJavaSpringConfig.class);
		AccountDao accountDao = (AccountDao) ctx.getBean(AccountDao.class);
		AccountService accountService = (AccountService) ctx.getBean(AccountService.class);
		System.out.println("Successfully loaded....");
	}
}
