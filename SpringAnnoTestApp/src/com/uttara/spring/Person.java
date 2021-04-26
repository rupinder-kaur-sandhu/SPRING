package com.uttara.spring;

import org.springframework.stereotype.Component;


public class Person {
	
	private int age;
	private String name;
	
	public Person()
	{
		System.out.println("In Person No-agr constrictor");
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("in person paramconstructor");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("in Person setAge() age = "+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("in Person setName() name = "+name);
	}
	
	public void dance()
	{
		if(age<40)
			System.out.println("Person "+name+" doing break dance");
		else
			System.out.println("Person cant do anything");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
