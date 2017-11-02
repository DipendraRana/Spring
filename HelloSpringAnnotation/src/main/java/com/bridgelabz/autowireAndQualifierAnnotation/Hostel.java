package com.bridgelabz.autowireAndQualifierAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hostel {
	
	private List<Room> deluxRoom;
	
	private List<Room> normalRoom;
	
	@Autowired
	@Qualifier("deluxRoom")
	public void addDeluxRoom(List<Room> deluxRoom) {
		this.deluxRoom=deluxRoom;
	}
	
	@Autowired
	@Qualifier("normalRoom")
	public void addNormalRoom(List<Room> normalRoom) {
		this.normalRoom=normalRoom;
	}
	
	public void displayDeluxRooms() {
		System.out.println(deluxRoom);
	}
	
	public void displayNormalRooms() {
		System.out.println(normalRoom);
	}
}