package dat108_oblig2;

public class Kokk extends Thread{
	
	private Brett brett;
	private String navn;
	
	
	public Kokk(Brett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	@Override
	public void run() {
		Hamburger burger = new Hamburger();
		brett.innKoe(burger);
		System.out.println(navn + "(Kokk) legger på hamburger (" + burger.getHamburger() + "). Brett: " + brett.toString());
	}
}

//Skal lage hamburgere og legge de på brettet

// If(brett er fullt) {
// wait
// notify if servitor takes away burger from brett