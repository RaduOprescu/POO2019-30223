package lab8pr4;

public class Exercitiu4 {
	static String nume = "marti";

	private void doIt() throws Exception4 {
		if (nume.equals("joi"))
			throw new Exception4("Zi gresita");
		System.out.println("Did it");
	}

	public static void main(String[] args) {

		try {
			(new Exercitiu4()).doIt();
		} catch (Exception4 e) {
			System.out.println(nume);
		} finally {
			System.out.println("s-a ajuns la clauza finally");
		}
	}

}
