package com.uttara.spring;

import org.springframework.stereotype.Component;

@Component("cc")
public class CreditCardAccount implements Account {
	
	public CreditCardAccount() {
		System.out.println("in creditcardAcc no-arg constructor");
	}

	@Override
	public void withDraw(double amt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debit(double amt) {
		// TODO Auto-generated method stub

	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
