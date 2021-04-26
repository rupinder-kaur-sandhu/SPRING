package com.uttara.springidol;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	public PoeticJuggler(int n,Poem poem) {
	 super(n);
	 System.out.println("inside Poetic JUggler constructor");
	 this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("while reciting");
		poem.recite();
	}
	
}
