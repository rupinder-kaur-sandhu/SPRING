package com.uttara.spring;

import java.util.List;

public class OneManBand extends Instrumentalist {
	
	private List<Instrument> instruments;

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		super.perform();
		System.out.println("in onemanband perform method");
		for(Instrument i: instruments)
			i.play();
	}

}
