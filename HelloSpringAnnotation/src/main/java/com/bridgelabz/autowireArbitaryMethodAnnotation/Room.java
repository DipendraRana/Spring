package com.bridgelabz.autowireArbitaryMethodAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	
	private String roomNo;
	
	private List<Student> allotedTo;
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo=roomNo;
	}
	
	public List<Student> getAllotedTo() {
		return allotedTo;
	}
	
	@Autowired
	public void setAllotedTo(List<Student> allotedTo) {
		this.allotedTo=allotedTo;
	}
	
	public void displayList() {
		System.out.println(roomNo);
		for(Student student:allotedTo)
			System.out.println(student.getName());
	}

}
