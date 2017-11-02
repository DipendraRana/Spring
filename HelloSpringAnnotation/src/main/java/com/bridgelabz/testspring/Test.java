package com.bridgelabz.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		
		Greeting greeting=(Greeting) context.getBean("greetingMessage");
		
		System.out.println(greeting.getMessage());
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
