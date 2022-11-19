package exo1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class compteLettre {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie :");
		String motIn = in.nextLine();
		
		motIn = motIn.replace(" ", "");
		
		String mot = motIn.toLowerCase();
		
		char a = 'a';
		char o = 'o';
		char e = 'e';
		
		int compteA = countOccurrences(mot, a);
		System.out.println("Il y à " + compteA + " 'a' dans votre saisie.");
		int compteO = countOccurrences(mot, o);
		System.out.println("Il y à " + compteO + " 'o' dans votre saisie.");
		int compteE = countOccurrences(mot, e);
		System.out.println("Il y à " + compteE + " 'e' dans votre saisie.");

	}

	private static int countOccurrences(String str, char ch) {

		Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(str);

		int counter = 0;
		while (matcher.find()) {
			counter++;
		}

		return counter;
	}
}