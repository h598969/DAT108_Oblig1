package dat108_oblig2;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Queue;

public class Brett {
	
	private static AtomicInteger nesteID = new AtomicInteger(1);
	private int id;
	private int kapasitet;
	
	Queue burgerline = new LinkedList<Hamburger>();
	
	public Brett(int kapasitet) {
		synchronized(nesteID) {
			this.kapasitet = kapasitet;
			id = nesteID.getAndIncrement();
			
		}
		
		
	}
	

	public int getBrett() {
		return id;
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
	
	public Object peek() {
		return burgerline.peek();
	}
	
	
}

//Kø hvor burgere skal legges på brettet av kokken

//Tas av av servitøren etter hvert som kunder kjøper en hamburger