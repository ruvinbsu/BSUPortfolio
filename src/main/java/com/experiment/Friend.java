package com.experiment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("someFriend")
public class Friend {
	
	private String firstname;

	public String getFirstname() {
		return firstname;
	}

	@Value("someFirstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
}
