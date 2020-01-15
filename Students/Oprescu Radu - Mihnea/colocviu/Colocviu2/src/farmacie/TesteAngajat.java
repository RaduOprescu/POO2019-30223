package farmacie;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TesteAngajat {

	void test() {
		AngajatFarmacie a = new AngajatFarmacie();
		ArrayList<String> medicamente = null;
		ArrayList<Medicament> reteta = null;
		a.adaugareMedicament(medicamente, "Decasept");
		a.adaugareMedicament(medicamente, "Plantusin");
		a.adaugareMedicament(medicamente, "Strepsil");
		a.eliminareMedicament(medicamente, "Plantusin");

	}

}
