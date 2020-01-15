package farmacie;

import java.util.ArrayList;
import java.util.Date;

public class AngajatFarmacie implements AtributiiAngajat {
	private String Nume;
	private int ID;
	private Date dataAngajare = new Date();
	private int bonusSalariu;

	public AngajatFarmacie(String nume, int iD, Date dataAngajare, int bonusSalariu) {
		Nume = nume;
		ID = iD;
		this.dataAngajare = dataAngajare;
		this.bonusSalariu = bonusSalariu;
	}

	public AngajatFarmacie() {
	}

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		Nume = nume;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getDataAngajare() {
		return dataAngajare;
	}

	public void setDataAngajare(Date dataAngajare) {
		this.dataAngajare = dataAngajare;
	}

	public int getBonusSalariu() {
		return bonusSalariu;
	}

	public void setBonusSalariu(int bonusSalariu) {
		this.bonusSalariu = bonusSalariu;
	}

	public void adaugareMedicament(ArrayList<String> medicamente, String medicament) {
		medicamente.add(medicament);

	}

	public void eliminareMedicament(ArrayList<String> medicamente, String medicament) {
		medicamente.remove(medicament);
	}

	public void verificaStoc(ArrayList<String> medicamente, String medicament) {
		if (medicamente.contains(medicament))
			System.out.println("check");
		else
			System.out.println("medicamentul nu e disponibil");
	}

	public void verificaFarmacie(ArrayList<String> medicamente, String medicament) {

	}

	public void modificaStoc(ArrayList<String> medicamente, String medicament, String operatie) {
		AngajatFarmacie ang = new AngajatFarmacie();
		if (operatie.equals("Adaugare"))
			ang.adaugareMedicament(medicamente, medicament);
		else if (operatie.equals("Eliminare"))
			ang.eliminareMedicament(medicamente, medicament);

	}

	public double proceseazaReteta(ArrayList<Medicament> reteta) {
		double total = 0;
		for (int i = 0; i < reteta.size(); i++) {
			total = total + reteta.get(i).getPret();
		}
		return total;
	}

	public double bonusAngajat(AngajatFarmacie a, ArrayList<Medicament> reteta) {
		double bonus = 0;
		bonus = (0.15 / 100) * a.proceseazaReteta(reteta);
		return bonus;

	}

}
