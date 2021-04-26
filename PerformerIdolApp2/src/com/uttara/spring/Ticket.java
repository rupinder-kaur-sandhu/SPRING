package com.uttara.spring;

public class Ticket {
	
	int number;
	static int count = 1;
	
	public Ticket() {
		number = count++;
	}

	@Override
	public String toString() {
		return "Ticket [number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		Ticket other = (Ticket) obj;
		if (number != other.number)
			return false;
		return true;
	}

}
