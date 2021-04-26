package com.uttara.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ba")
public class BankAccount implements Account {
	
	@Value("10000")
	private double balance;
	
	@Value("acc001")
	private String accNum;
	
	public BankAccount() {
		System.out.println(" in BankAccount no arg constructor");
	}

	@Override
	public void withDraw(double amt) {
		// TODO Auto-generated method stub
		
		balance = balance - amt;

	}

	@Override
	public void debit(double amt) {
		// TODO Auto-generated method stub
		balance = balance + amt;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accNum == null) ? 0 : accNum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		BankAccount other = (BankAccount) obj;
		if (accNum == null) {
			if (other.accNum != null)
				return false;
		} else if (!accNum.equals(other.accNum))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", accNum=" + accNum + "]";
	}

}
