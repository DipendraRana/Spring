package com.bridgelabz.requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String name;
	
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name=name;
	}
}
