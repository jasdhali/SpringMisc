package com.apress.springrecipes.sequence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*ApplicationContext context =
					new ClassPathXmlApplicationContext("/applicationContect.xml");
		SequenceGenerator generator =
					(SequenceGenerator) context.getBean("sequenceGenerator");*/
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext();
		context.scan("com.apress.springrecipes.sequence");
		SequenceDao sequenceDao = (SequenceDao)context.getBean("sequenceDao");
		System.out.println(sequenceDao.getNextValue("IT"));
		context.close();
	}

}
