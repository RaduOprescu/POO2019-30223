import java.util.*;

public class Ghiozdan {

	Rechizite[] lista = new Rechizite[100];

	public void add(Caiet a, int index) {
		lista[index] = a;

	}

	public void add(Manual a, int index) {
		lista[index] = a;

	}

	public void listManual() {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getNume().contains("Manual"))
					System.out.println(lista[i].getNume());
			}
		}
	}

	public void listCaiet() {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getNume().contains("Caiet")) {
					System.out.println(lista[i].getNume());
				}
			}
		}
	}

	public void listItems() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i].getNume());
			}
		}
	}

	public void getNrRechizite() {
		int nr = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null)
				nr++;
		}
		System.out.println(nr);
	}

	public void getNrManuale() {
		int nr = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getNume().contains("Manual"))
					nr++;
			}
		}
		System.out.println(nr);
	}

	public void getNrCaiete() {
		int nr = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getNume().contains("Caiet"))
					nr++;
			}
		}
		System.out.println(nr);
	}

}
