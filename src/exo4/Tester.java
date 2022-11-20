package exo4;

public class Tester {
	public static void main(String[] args) {
		Contact con1 = new Contact("Coffe", "Jean-Pierre", 54);
		String infos = con1.getInfos();
		System.out.println(infos);
		String initiales = con1.getInitiales();
		System.out.println(initiales);
		String trigrammes = con1.getTrigrammes();
		System.out.println(trigrammes);
	}
}
