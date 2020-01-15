package farmacie;

public abstract class Pacient implements TipBoala {
	String nume, prenume;
	int varsta;
	String sex;
	private DoctorFarmacie d;

	public Pacient(String nume, String prenume, int varsta, String sex) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void consultatie() {
		if (this.d.isCorinca() == false) {
			System.out.println("boala cronica");
		} else
			System.out.println("boala acuta");

	}

	public int gradSeveritate() {
		int rezultat = 0;
		if (d.isCorinca() == false)
			rezultat = 5;
		else
			rezultat = 10;
		rezultat = rezultat + d.medicamente.size();
		return rezultat;
	}

}
