package dat108_oblig2;

public class Servitor extends Thread {
	
	private Brett brett;
	private String navn;
	private Kokk kokk;
	private Hamburger burger;
	Object lock = new Object();
	
	public Servitor(Brett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	@Override
	public void run() {
		boolean running = true;
			synchronized(lock) {
				while (running) {
					if (brett.size() == 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							System.out.println(navn + "(servitør) ønsker å ta hamburger, men brettet er tomt. Venter!");
						}
					}
	
					brett.utKoe();
					System.out.println(navn + "(Servitør) tar av hamburger (" + "1" + "). Brett: " + brett.getBrett());
	//				Kokk.openQueue();
				}
			}	
		}
	
	public void notEmpty() {
		lock.notifyAll();
	}
}
