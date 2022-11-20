package exo6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sarah Katz & Marc-Antoine Taisant
 *
 */
public class CompteBancaire {
	String titulaire;
	double solde;
	String[] intitules;
	double[] montants;

	/**
	 * @param titulaire owner
	 * @param solde balance
	 * @param intitules transaction info
	 * @param montants transaction value
	 */
	CompteBancaire(String titulaire, float solde, String[] intitules, double[] montants) {
		this.titulaire = titulaire;
		this.solde = solde;
		this.intitules = intitules;
		this.montants = montants;
	}

	/**
	 * @return a double of the current balance.
	 */
	public double calculSolde() {
		for (int i = 0; i <= this.montants.length - 1; i++) {
			solde = this.solde + this.montants[i];
		}
		return solde;
	}

	/**
	 * @return a double of the average transaction.
	 */
	public double mouvementMoyen() {
		double somme = 0;
		for(double nombre:this.montants)
		for (int i = 0; i <= this.montants.length - 1; i++) {
			somme = somme + this.montants[i];
		}
		double moyenne = somme / this.montants.length;
		return moyenne;
	}
	
	/**
	 * @return a double of the largest transaction.
	 */
	public double grandMouvement() {
		Arrays.sort(this.montants);
		double plusGrand = this.montants[this.montants.length - 1];
		return plusGrand;
	}
	
	/**
	 * @return a double of the smallest transaction.
	 */
	public double petitMouvement() {
		Arrays.sort(this.montants);
		double plusPetit = this.montants[0];
		return plusPetit;
	}	
	
	public String getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
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