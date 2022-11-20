package exo3;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class RemplaceLettre {
	String saisie;

	/**
	 * @param saisie String you want to see transformed.
	 */
	RemplaceLettre(String saisie) {
		this.saisie = saisie;
	}

	/**
	 * @return String "resultat" where 'e' is replaced by '3' and 'o' is replaced by '0'.
	 */
	public String changeLettre() {
		String resultat = this.saisie.toLowerCase();
		resultat = resultat.replace("o", "0");
		resultat = resultat.replace("e", "3");
		return resultat;
	}

	public String getSaisie() {
		return saisie;
	}

	public void setSaisie(String saisie) {
		this.saisie = saisie;
	}
}