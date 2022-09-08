package dat108_oblig2;

import java.util.LinkedList;
import java.util.Queue;

public class Brett {
	
	private int kapasitet;
	
	Queue burgerline = new LinkedList<Hamburger>();
	
	public Brett(int kapasitet) {
		
		this.kapasitet = kapasitet;
		
	}
	

	
	public void innKoe(Hamburger hamburger) {
		burgerline.add(hamburger);
		
	}
	
	public void utKoe() {
		burgerline.remove();
	}
	
	public int size() {
		return burgerline.size();
	}
}

//Kø hvor burgere skal legges på brettet av kokken

//Tas av av servitøren etter hvert som kunder kjøper en hamburger