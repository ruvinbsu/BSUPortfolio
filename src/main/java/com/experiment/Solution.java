package com.experiment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experiment/beans.xml");

		Person person = (Person)context.getBean("somePerson");
		
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println(person.getSurname());
		
		System.out.println(person.getMyFriend().getFirstname());		
	}
}
