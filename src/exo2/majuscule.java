package exo2;

import java.util.Scanner;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class majuscule {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer un truc :");
		String saisie = in.nextLine();
		String[] array = saisie.split(" ");
		String sortie = "";

		for (int i = 0; i < array.length; i++) {
			String mot = array[i];
			String firstLetter = mot.substring(0, 1).toUpperCase();
			String otherLetters = mot.substring(1, mot.length()).toLowerCase();

			mot = firstLetter + otherLetters;
			sortie += mot + " ";
		}

		System.out.println(sortie);
	}
}
