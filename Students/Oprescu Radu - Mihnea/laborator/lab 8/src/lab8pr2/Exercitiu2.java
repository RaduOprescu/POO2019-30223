package lab8pr2;

public class Exercitiu2 {
	public static void main(String[] args) {

		String ex = null;

		try {
			if (ex.equals("mere"))
				System.out.print("Ok");
			else
				System.out.print("cuvinte diferite");
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
	}
}
