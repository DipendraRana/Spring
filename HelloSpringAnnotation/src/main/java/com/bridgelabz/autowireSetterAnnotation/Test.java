package com.bridgelabz.autowireSetterAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/autowireSetterAnnotation/bean.xml");
		Room room=(Room) context.getBean("room");
		System.out.println(room);
		((ClassPathXmlApplicationContext)context).close();
	}

}
