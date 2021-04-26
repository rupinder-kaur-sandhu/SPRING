package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting spring container .......................");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("started spring container");
		
		Performer p1 = (Performer)ctx.getBean("i1");
		Performer p2 = (Performer)ctx.getBean("i2");
		Performer p3 = (Performer)ctx.getBean("i3");
		Performer p4 = (Performer)ctx.getBean("i4");
		
		Ticket t1 = (Ticket)ctx.getBean("ticket");
		Ticket t2 = (Ticket)ctx.getBean("ticket");
		
		System.out.println("t1 "+t1);
		System.out.println("t2 "+t2);
		
		System.out.println("t1==t2 "+(t1==t2));
		
		p1.perform();
		p2.perform();
		p3.perform();
		p4.perform();
		
		ctx.close();
	}

}
