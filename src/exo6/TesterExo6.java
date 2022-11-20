package exo6;

public class TesterExo6 {
	public static void main(String[] args) {
		String[] str = { "Salaire", "Gaz", "Burger King", "Essence", "Cadeau Anniv"};
		double[] db = { 1324.64, -260, -32.54, -90.36, 140 };
		CompteBancaire test = new CompteBancaire("Marco", 5000, str, db);		
		double solde = test.calculSolde();
		System.out.println("Votre solde est de : " + solde + " €");		
		double moyenne = test.mouvementMoyen();
		System.out.println("Votre mouvement moyen est de : " + moyenne + " €");		
		double grand = test.grandMouvement();
		System.out.println("Votre plus grand mouvement est de  : " + grand + " €");		
		double petit = test.petitMouvement();
		System.out.println("Votre plus petit mouvement est de  : " + petit + " €");
		test.saisieUtilisateur();
	}
}