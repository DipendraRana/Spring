package com.bridgelabz.autowireSetterAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	
	private String roomNo;
	
	private Student allotedTo;
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo=roomNo;
	}
	
	public Student getAllotedTo() {
		return allotedTo;
	}
	
	@Autowired
	public void setAllotedTo(Student allotedTo) {
		this.allotedTo=allotedTo;
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
