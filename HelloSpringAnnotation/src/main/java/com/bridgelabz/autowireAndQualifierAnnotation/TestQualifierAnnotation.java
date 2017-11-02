package com.bridgelabz.autowireAndQualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQualifierAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/autowireAndQualifierAnnotation/bean.xml");
		Hostel hotel=(Hostel) context.getBean("hostel");
		hotel.displayDeluxRooms();
		hotel.displayNormalRooms();
		((ClassPathXmlApplicationContext)context).close();
	}

}