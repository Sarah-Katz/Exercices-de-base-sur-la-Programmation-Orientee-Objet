package exo7;

import java.util.ArrayList;
import java.util.Scanner;

public class InputComptable {
	public static int getLineQuantity() {
		Scanner in = new Scanner(System.in);
		int lineQuantity;
		do {
			System.out.println("Combien de lignes comptables souhaitez vous enregistrer ? (max : 5)");
			lineQuantity = in.nextInt();
		} while (lineQuantity < 1 || lineQuantity > 5);
		return lineQuantity;
	}

	public static String inputTitle() {
		Scanner in = new Scanner(System.in);
		System.out.println("Quel est l'intitulé de votre ligne comptable ?");
		String intitule = in.nextLine();
		return intitule;
	}

	public static int inputAmount() {
		Scanner in = new Scanner(System.in);
		System.out.println("Quel est le montant de votre ligne comptable ?");
		int montant = in.nextInt();
		return montant;
	}

	public static void printResult(LigneComptable[] lignes) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < lignes.length; i++) {
			result.append("Ligne ");
			result.append(i + 1);
			result.append(" :");
			result.append(" intitulé : ");
			result.append(lignes[i].getIntitule());
			result.append(" montant : ");
			result.append(lignes[i].getMontant());
			result.append("\n");
		}
		int balance = 0;
		for (int i = 0; i < lignes.length; i++) {
			balance += lignes[i].getMontant();
		}
		result.append("\n");
		result.append("Solde du compte : ");
		result.append(balance);
		System.out.println(result);
	}
}
