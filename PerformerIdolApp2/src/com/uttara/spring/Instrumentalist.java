package com.uttara.spring;

public class Instrumentalist implements Performer {
	
	private String name;
	private Instrument instrument;

	public String getName() {
		return name;
	}

//	public Instrumentalist(String name) {
//		super();
//		this.name = name;
//		System.out.println("in instrumentalist param constructor" +name);
//	}

	public void setName(String name) {
		this.name = name;
		System.out.println("in name setter method");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("in instrumrntalist setter method "+instrument);
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("I am an instrumentalist "+name+ " going to perform with "+instrument);
		instrument.play();
	}

	@Override
	public String toString() {
		return "Instrumentalist [name=" + name + ", instrument=" + instrument + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
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
		Instrumentalist other = (Instrumentalist) obj;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
