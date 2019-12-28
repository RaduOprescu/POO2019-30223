package lab8pr3;

import java.io.IOException;

public class Exercitiu3 {

	static void doIt() throws ArrayIndexOutOfBoundsException {
		int x[] = new int[5];
		x[6] = 8;
	}

	public static void main(String[] args) {

		try {
			doIt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indexul depaseste marimea vectorului");
		}

	}

}
