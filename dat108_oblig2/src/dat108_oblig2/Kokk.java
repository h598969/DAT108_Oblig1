package dat108_oblig2;

public class Kokk extends Thread{
	
	private Brett brett;
	private String navn;
	Object fullQueue = new Object();
	
	public Kokk(Brett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	@Override
	public void run() {
		boolean running = true;
		synchronized(fullQueue) {
			while (running) {
				if (brett.size() == 4) {
					try {
						fullQueue.wait();
					} catch (InterruptedException e) {
					}
				}

				Hamburger burger = new Hamburger();
				brett.innKoe(burger);
				System.out.println(navn + "(Kokk) legger på hamburger (" + burger.getHamburger() + "). Brett: " + brett.getBrett());
			}
//			Hamburger burger = new Hamburger();
//			brett.innKoe(burger);
//			System.out.println(navn + "(Kokk) legger på hamburger (" + burger.getHamburger() + "). Brett: " + brett.getBrett());

		}
		
	}
	
	public void openQueue() {
		fullQueue.notifyAll();
	}
	
	
}

//Skal lage hamburgere og legge de på brettet

// If(brett er fullt) {
// wait
// notify if servitor takes away burger from brett