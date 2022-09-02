package dat108_oblig2;

public class Servitor extends Thread {
	
	private Brett brett;
	private String navn;
	
	public Servitor(Brett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
}
