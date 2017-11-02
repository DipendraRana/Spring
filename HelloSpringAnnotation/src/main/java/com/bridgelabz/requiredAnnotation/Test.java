package com.bridgelabz.requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/requiredAnnotation/bean.xml");
		Student student=(Student) context.getBean("student");
		System.out.println(student.getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
