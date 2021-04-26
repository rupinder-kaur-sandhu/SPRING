package com.uttara.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIdol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Performers begin");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springidol.xml");
		
		Performer duke = (Performer)ctx.getBean("duke");
		System.out.println("before duke performing");
		duke.perform();
		System.out.println("after duke performing");
		
		Performer hans = (Performer)ctx.getBean("hans");
		System.out.println("before duke performing");
		hans.perform();
		System.out.println("after duke performing");
		
	}

}
