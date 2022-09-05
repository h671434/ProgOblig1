package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO3 {

	public static void main(String[] args) {

		String nInn = showInputDialog("Gi et heltall");
		int n = parseInt(nInn);
		int fakultet = 1;

		for (int i = 1; i <= n; i++) {
			fakultet = fakultet * i;
		}
		System.out.println("Fakultet av " + n + " er " + fakultet);
	}
}
