package com.uttara.spring;

public class Tabla implements Instrument {
	
	public Tabla() {
		System.out.println(" in tabla");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DHUN DHUN .......");
		
		
	}

	@Override
	public String toString() {
		return "Tabla";
	}

}
