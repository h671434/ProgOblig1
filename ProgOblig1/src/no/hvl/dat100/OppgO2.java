package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO2 {

	public static void main(String[] args) {
		
		String poengInn;
		int poengsum;
		int poengDelt;
		
		final int ANT_STUD = 10;
		int studnr = 0;
		
		for (int i=1; i <= ANT_STUD; i++) {
			
			poengInn = showInputDialog("Skriv inn poengsum: ");	
			poengsum = parseInt(poengInn);
			poengDelt = poengsum / 10;
			
			if (poengsum >= 0 && poengsum <= 100) {
				
				studnr = studnr + 1;
				System.out.println("Student nr: " + studnr);
				
				switch (poengDelt) {
				
				case 0:
					System.out.println("Karakter F");
					break;
				
				case 1:
					System.out.println("Karakter F");
					break;
					
				case 2:
					System.out.println("Karakter F");
					break;
					
				case 3:
					System.out.println("Karakter F");
					break;
					
				case 4:
					System.out.println("Karakter E");
					break;
					
				case 5:
					System.out.println("Karakter D");
					break;
					
				case 6:
					System.out.println("Karakter C");
					break;
					
				case 7:
					System.out.println("Karakter C");
					break;
					
				case 8:
					System.out.println("Karakter B");
					break;
					
				case 9:
					System.out.println("Karakter A");
					break;
					
				case 10:
					System.out.println("Karakter A");
					break;
				}
				
			} else {
				System.out.println("Ugyldig poengsum");
				i = i - 1;
			}
			
		}
	}

}
