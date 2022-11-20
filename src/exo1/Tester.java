package exo1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie : ");
		String saisie = in.nextLine();
		ComptageChar test = new ComptageChar(saisie);
		int[] compte = test.compteChar();
		test.resultat(compte);
	}

}