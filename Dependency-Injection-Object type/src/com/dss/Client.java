package com.dss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

/*		MathCheat cheat = new MathCheat();
		Student student = new Student();
		student.setMathcheat(cheat);*/
		//student.student();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.cml file loaded");
		Student s = context.getBean("stu", Student.class);
		s.cheating();
		
	
		

	}

}
