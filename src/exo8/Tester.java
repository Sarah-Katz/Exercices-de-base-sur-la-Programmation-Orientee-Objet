package exo8;

public class Tester {

	public static void main(String[] args) {
		Outil marteau = new Outil("Marteau", "Sert à taper des clous", "Taper d'autres choses que des clous ?", "Boite à outil");
		Outil autreMarteau = new Outil(marteau);
		String test = autreMarteau.getDescription();
		System.out.println(test);
	}
}
