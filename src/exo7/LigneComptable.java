package exo7;

public class LigneComptable {
	private String intitule;
	private int montant;
	
	LigneComptable(String str, int i) {
		this.intitule = str;
		this.montant = i;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
}