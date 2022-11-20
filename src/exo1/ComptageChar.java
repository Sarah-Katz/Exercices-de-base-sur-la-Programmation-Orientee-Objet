package exo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 * 
 */
public class ComptageChar {
	String saisie;

	/**
	 * @param saisie is the String in which you want to count the chars
	 */
	ComptageChar(String saisie) {
		this.saisie = saisie;
	}

	/**
	 * @param saisie is the String in which you want to count the chars
	 * @return Returns the number of 'a' 'e' and 'o' char in a int array
	 */
	public int[] compteChar(String saisie) {
		int[] compte = new int[3];
		compte[0] = comptageLettres(saisie, 'a');
		compte[1] = comptageLettres(saisie, 'o');
		compte[2] = comptageLettres(saisie, 'e');
		return compte;
	}

	/**
	 * @param str is the String in which chars will be counted
	 * @param ch is the char to be counted
	 * @return a int of the occurences of the specified char
	 */
	private int comptageLettres(String str, char ch) {
		str = str.replace(" ", "");
		str = str.toLowerCase();
		Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(str);
		int counter = 0;
		while (matcher.find()) {
			counter++;
		}
		return counter;
	}

	/**
	 * @param compte is the int array of char occurences to be printed
	 */
	public void resultat(int[] compte) {
		System.out.println("Il y a " + compte[0] + " 'a' dans votre saisie.");
		System.out.println("Il y a " + compte[1] + " 'o' dans votre saisie.");
		System.out.println("Il y a " + compte[2] + " 'e' dans votre saisie.");
	}

	public String getSaisie() {
		return saisie;
	}

	public void setSaisie(String saisie) {
		this.saisie = saisie;
	}
}
