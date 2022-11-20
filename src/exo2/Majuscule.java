package exo2;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class Majuscule {
	String saisie;

	/**
	 * @param saisie is the String where you want to capitalize every word's first letter
	 */
	Majuscule(String saisie) {
		this.saisie = saisie;
	}

	/**
	 * @return a String where every words now start with a Capital letter
	 */
	public String creerMaj() {
		String[] array = saisie.split(" ");
		String resultat = "";
		for (int i = 0; i < array.length; i++) {
			String mot = array[i];
			String firstLetter = mot.substring(0, 1).toUpperCase();
			String otherLetters = mot.substring(1, mot.length()).toLowerCase();
			mot = firstLetter + otherLetters;
			resultat += mot + " ";
		}
		return resultat;
	}

	public String getSaisie() {
		return saisie;
	}

	public void setSaisie(String saisie) {
		this.saisie = saisie;
	}
}
