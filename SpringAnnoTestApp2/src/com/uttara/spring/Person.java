package com.uttara.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("27")
	private int age;
	
	@Value("Rupinder")
	private String name;
	
	@Autowired
	private Address address;

	private Account account;
	
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
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}
	
	@Autowired
	@Qualifier("ba")
	public void setAccount(Account account) {
		this.account = account;
		System.out.println("in person->Account acc = "+account);
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
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
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
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
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
		return "Person [age=" + age + ", name=" + name + ", address=" + address + ", account=" + account + "]";
	}

	

	
}
