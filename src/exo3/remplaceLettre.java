package exo3;

import java.util.Scanner;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */

public class remplaceLettre {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie :");
		String mot = in.nextLine();		
		mot = mot.replace("e", "3");
		mot = mot.replace("o", "0");		
		System.out.println(mot);		
	}
}


