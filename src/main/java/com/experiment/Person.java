package com.experiment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("somePerson")
public class Person {
	
	private String surname;
	
	@Autowired
	private Friend myFriend;

	public Person(){
	}
	
	public String getSurname() {
		return surname;
	}

	@Value(value="someSurname")
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Friend getMyFriend() {
		return myFriend;
	}

	public void setMyFriend(Friend myFriend) {
		this.myFriend = myFriend;
	}
	
	
}
