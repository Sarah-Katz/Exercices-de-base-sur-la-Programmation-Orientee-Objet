package exo1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class CompteLettre {

	public static void main(String[] args) {
		char a = 'a';
		char o = 'o';
		char e = 'e';
		String mot = entreeSaisie();
		int[] compte = new int[3];
		compte[0] = comptageLettres(mot, a);
		compte[1] = comptageLettres(mot, o);
		compte[2] = comptageLettres(mot, e);
		resultat(compte);
	}

	private static String entreeSaisie() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez une saisie :");
		String motIn = in.nextLine();
		motIn = motIn.replace(" ", "");
		String mot = motIn.toLowerCase();
		return mot;
	}

	private static int comptageLettres(String str, char ch) {
		Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(str);
		int counter = 0;
		while (matcher.find()) {
			counter++;
		}
		return counter;
	}

	private static void resultat(int[] compte) {
		System.out.println("Il y a " + compte[0] + " 'a' dans votre saisie.");
		System.out.println("Il y a " + compte[1] + " 'o' dans votre saisie.");
		System.out.println("Il y a " + compte[2] + " 'e' dans votre saisie.");
	}
}