package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgO1 {

	public static void main(String[] args) {

		String bruttoInn = showInputDialog("Skriv inn bruttoinntekt ");
		
		int brutto = parseInt(bruttoInn);
		
		double trinnskatt;
		
		//Trinn 1
		if (brutto >= 164101 && brutto <= 230950) {
			trinnskatt = (brutto * 0.0093);
			System.out.println("Trinn 1: 0,93%");
			System.out.println("Trinnskatt: " + trinnskatt);
		}
		
		//Trinn 2
		if (brutto >= 230951 && brutto <= 580650) {
			trinnskatt = (brutto * 0.0241);
			System.out.println("Trinn 2: 2,41% i skatt");
			System.out.println("Trinnskatt: " + trinnskatt);
		}
		
		//Trinn 3
		if (brutto >= 580651 && brutto <= 934050) {
			trinnskatt = (brutto * 0.1152);
			System.out.println("Trinn 3: 11,52%");
			System.out.println("Trinnskatt: " + trinnskatt);
		}
		
		//Trinn 4
		if (brutto >= 934051) {
			trinnskatt = (brutto * 0.1452);
			System.out.println("Trinn 4: 14,52");
			System.out.println("Trinnskatt: " + trinnskatt);
		}
		
		//Under 164101 i bruttoinntekt
		if (brutto <= 164100) {
			System.out.println("Ingen trinnskatt");
		}
		
	}
}
