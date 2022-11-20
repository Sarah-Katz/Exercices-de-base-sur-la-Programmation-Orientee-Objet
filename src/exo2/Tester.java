package exo2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie : ");
		String saisie = in.nextLine();
		Majuscule test = new Majuscule(saisie);
		String resultat = test.creerMaj();
		System.out.println(resultat);
	}

}