package exo4;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class Contact {
	public String nom;
	public String prenom;
	public int age;

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	Contact(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	/**
	 * Gets first chars of "nom" and "prenom" to return "Initiales".
	 */
	public String getInitiales() {
		char p = prenom.charAt(0);
		char n = nom.charAt(0);
		StringBuilder initiales = new StringBuilder();
		initiales.append("Les initiales du contact sont : ");
		initiales.append(p);
		initiales.append(n);
		initiales.toString();
		return initiales.toString();
	}

	/**
	 * Gets first chars of "nom" and "prenom" and last char of "nom" to return
	 * "Trigrammes".
	 */
	public String getTrigrammes() {
		char p = prenom.charAt(0);
		char n = nom.charAt(0);
		char nLast = nom.charAt(nom.length() - 1);
		String nLastUpper = "" + nLast;
		nLastUpper = nLastUpper.toUpperCase();
		StringBuilder trigrammes = new StringBuilder();
		trigrammes.append("Les trigrammes du contact sont : ");
		trigrammes.append(p);
		trigrammes.append(n);
		trigrammes.append(nLastUpper);
		return trigrammes.toString();
	}

	/**
	 * Returns all infos about the contact.
	 */
	public String getInfos() {
		StringBuilder infos = new StringBuilder();
		infos.append("Nom : ");
		infos.append(nom);
		infos.append(", Prénom : ");
		infos.append(prenom);
		infos.append(", Age : ");
		infos.append(age);
		return infos.toString();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}