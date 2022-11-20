package exo8;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class Outil {
	String nom;
	String description;
	String utilisationPossible;
	String lieuStockage;

	/**
	 * @param str1 name
	 * @param str2 description
	 * @param str3 usage
	 * @param str4 where to put it
	 */
	Outil(String str1, String str2, String str3, String str4) {
		this.nom = str1;
		this.description = str2;
		this.utilisationPossible = str3;
		this.lieuStockage = str4;
	}

	/**
	 * @param name of a "Outil" object
	 */
	Outil(Outil x) {
		this.nom = x.nom;
		this.description = x.description;
		this.utilisationPossible = x.utilisationPossible;
		this.lieuStockage = x.lieuStockage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUtilisationPossible() {
		return utilisationPossible;
	}

	public void setUtilisationPossible(String utilisationPossible) {
		this.utilisationPossible = utilisationPossible;
	}

	public String getLieuStockage() {
		return lieuStockage;
	}

	public void setLieuStockage(String lieuStockage) {
		this.lieuStockage = lieuStockage;
	}
}

