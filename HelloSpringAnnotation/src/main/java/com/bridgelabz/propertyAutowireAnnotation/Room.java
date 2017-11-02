package com.bridgelabz.propertyAutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	
	private String roomNo;
	
	@Autowired
	private Student allotedTo;
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo=roomNo;
	}
	
	public String toString() {
        String name= "";
        if(allotedTo!=null)
        {
               name=allotedTo.getName();
        }
        return "Room [roomNumber=" + roomNo + ", allotedTo=" + name+ "]";
	}

}
