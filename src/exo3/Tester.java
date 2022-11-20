package exo3;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie :");
		String saisie = in.nextLine();
		RemplaceLettre test = new RemplaceLettre(saisie);
		String resultat = test.changeLettre(saisie);
		System.out.println(resultat);
	}
}
