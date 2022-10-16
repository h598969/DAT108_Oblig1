package dat108_oblig2;

import java.util.concurrent.atomic.AtomicInteger;

public class Hamburger {
	
	private static AtomicInteger nesteID = new AtomicInteger(1);
	private int id;
	
	public Hamburger() {
		synchronized(nesteID) {
			id = nesteID.getAndIncrement();
		}
		
	}
	
	public int getHamburger() {
		return id;
	}
}
