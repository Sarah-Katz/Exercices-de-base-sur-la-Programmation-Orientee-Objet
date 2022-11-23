package exo7;

import java.util.ArrayList;

public class TesterExo7 {
	public static void main(String[] args) {
		int lineQuantity = InputComptable.getLineQuantity();
		ArrayList<String> intitules = new ArrayList<String>();
		ArrayList<Integer> montants = new ArrayList<Integer>();
		for (int i = 0; i < lineQuantity; i++) {
			intitules.add(InputComptable.inputTitle());
			montants.add(InputComptable.inputAmount());
		}
		Object[] titleArray = intitules.toArray();
		Object[] amountArray = montants.toArray();
		LigneComptable[] lignes = new LigneComptable[lineQuantity];
		for (int i = 0; i < lineQuantity; i++) {
			lignes[i] = new LigneComptable((String) titleArray[i], (int) amountArray[i]);
		}
		InputComptable.printResult(lignes);
	}
}
