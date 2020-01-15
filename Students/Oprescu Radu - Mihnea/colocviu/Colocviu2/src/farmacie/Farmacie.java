package farmacie;

import java.util.HashMap;
import java.util.Map;

public class Farmacie { // implements Clonable {

	private String denumire;
	private String adresa;
	private int nrAdresa;
	private int nrTelefon;
	private String website;
	Map<String, Integer> nrReteteAngajat = new HashMap<String, Integer>();
	Map<String, Integer> medicamenteStoc = new HashMap<String, Integer>();

	public Farmacie(String denumire, String adresa, int nrAdresa, int nrTelefon, String website,
			Map<String, Integer> nrReteteAngajat, Map<String, Integer> medicamenteStoc) {
		this.denumire = denumire;
		this.adresa = adresa;
		this.nrAdresa = nrAdresa;
		this.nrTelefon = nrTelefon;
		this.website = website;
		this.nrReteteAngajat = nrReteteAngajat;
		this.medicamenteStoc = medicamenteStoc;
	}

}
