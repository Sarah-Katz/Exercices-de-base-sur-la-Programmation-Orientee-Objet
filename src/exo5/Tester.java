package exo5;

public class Tester {
	public static void main(String[] args) {
		String[] str = { "Salaire", "Gaz", "Burger King", "Essence" };
		double[] db = { 1324.64, -260, -32.54, -90.36 };
		MouvementsBanque test = new MouvementsBanque(str, db);
		test.getInfos();
	}
}