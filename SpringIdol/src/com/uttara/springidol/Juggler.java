package com.uttara.springidol;

public class Juggler implements Performer {
	
	private int numOfBags = 3;
	
	public Juggler(int n) {
		numOfBags = n;
	}
	
	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("i am a juggler "+numOfBags+"bags");
	}

}
