package dat108_oblig2;

import java.util.Arrays;

public class Main {

	public static void main(String... blablabla) { 
		   
		  final String[] kokker = {"Sivert", "Bjorn-Egil", "Bjorn-Sigurd"}; 
		  final String[] servitorer = {"Anders", "Andreas"}; 
		  final int KAPASITET = 4; 
		 
		  skrivUtHeader(kokker, servitorer, KAPASITET);
		   
		  Brett brett = new Brett(KAPASITET);
		   
		  for (String navn : kokker) {
			  new Kokk(brett, navn).start();
		  }
		  
		  for (String navn : servitorer) {
			  new Servitor(brett, navn).start();
		  }
		  
	}
	
	public static void skrivUtHeader (String[]kokker, String[]servitorer, int kapasitet) {
		System.out.println("I denne simuleringen har vi ");
		System.out.println("	3 kokker: " + Arrays.toString(kokker));
		System.out.println("	2 servitører: " + Arrays.toString(servitorer));
		System.out.println("	Kapasiteten til brettet er 4 hamburgere.");
		System.out.println("Vi starter...");

	}
}
