package com.uttara.spring;

public class Piano implements Instrument {
	
	public Piano() {
		System.out.println(" in paino");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("PLINK PLINK PLINK......");

	}

	@Override
	public String toString() {
		return "Piano";
	}

}
