package com.uttara.spring;

public interface Account {
	
	public void withDraw(double amt );
	public void debit(double amt);
	public double checkBalance();

}
