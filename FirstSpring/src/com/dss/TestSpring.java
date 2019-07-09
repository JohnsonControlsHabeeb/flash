package com.dss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("first.xml");
		
		Resturant restau = (Resturant)context.getBean("res");
		
		restau.greetCustomer();

	}

}
