package exo5;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class MouvementsBanque {
	String[] intitules;
	double[] montants;

	/**
	 * @param str Array of Strings of names for deposits / withdrawals
	 * @param db Array of doubles of values for deposits / withdrawals
	 */
	MouvementsBanque(String[] str, double[] db) {
		this.intitules = str;
		this.montants = db;
	}

	/**
	 * Displays all informations in the arrays
	 */
	public void getInfos() {
		for (int i = 0; i <= this.intitules.length - 1; i++) {
			StringBuilder releve = new StringBuilder();
			releve.append("Intitulé : ");
			releve.append(this.intitules[i]);
			releve.append("\n");
			releve.append("Montant : ");
			releve.append(this.montants[i]);
			releve.append(" €");
			releve.append("\n");
			releve.toString();
			System.out.println(releve);
		}
	}

	public String[] getIntitules() {
		return intitules;
	}

	public void setIntitules(String[] intitules) {
		this.intitules = intitules;
	}

	public double[] getMontants() {
		return montants;
	}

	public void setMontants(double[] montants) {
		this.montants = montants;
	}
}