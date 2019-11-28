
public class Student {

	String nume = new String();
	String prenume = new String();
	Masina m = new Masina();

	public Student(String nume, String prenume, Masina m) {

		this.nume = nume;
		this.prenume = prenume;
		this.m = m;
	}
	
	public Student() { //pt super din clasa masina
		
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

	public Masina getM() {
		return m;
	}

	public void setM(Masina m) {
		this.m = m;
	}

	public String toString() {
		return nume + " " + prenume + " " + m.marca +" " +m.colorCar;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
