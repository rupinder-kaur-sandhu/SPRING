package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		Person p1 = (Person)ctx.getBean("person");
		System.out.println("person p1 "+p1);
		
		Person p2 = (Person)ctx.getBean("person");
		System.out.println("person p2 "+p2);

	}

}
