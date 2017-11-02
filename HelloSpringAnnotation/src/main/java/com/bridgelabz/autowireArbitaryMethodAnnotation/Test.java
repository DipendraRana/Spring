package com.bridgelabz.autowireArbitaryMethodAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/autowireArbitaryMethodAnnotation/bean.xml");
		Room room=(Room) context.getBean("room");
		room.displayList();
		((ClassPathXmlApplicationContext)context).close();
	}

}
