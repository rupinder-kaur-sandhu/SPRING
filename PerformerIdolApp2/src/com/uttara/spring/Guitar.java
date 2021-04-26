package com.uttara.spring;

public class Guitar implements Instrument {
	
	public Guitar() {
		System.out.println(" in guitar");
	}
	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("STRUM STRUM");
		
	}

	@Override
	public String toString() {
		return "Guitar";
	}
	

}
