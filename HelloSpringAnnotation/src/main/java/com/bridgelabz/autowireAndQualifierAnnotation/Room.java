package com.bridgelabz.autowireAndQualifierAnnotation;

public class Room {
	
	private String roomNumber;
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(String roomNumber) {
		this.roomNumber=roomNumber;
	}
	@Override
    public String toString() {
           return "Room [roomNumber=" + roomNumber + "]";
    }      
}