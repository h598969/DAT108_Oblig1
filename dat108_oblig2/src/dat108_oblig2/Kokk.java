package dat108_oblig2;

public class Kokk extends Thread{
	
	private Brett brett;
	private String navn;
	
	
	public Kokk(Brett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
}

//Skal lage hamburgere og legge de på brettet