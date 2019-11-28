import java.util.*;

public class Persoana implements Comparable<Persoana> {

	private String nume = new String();
	private String prenume = new String();
	private int varsta;

	Persoana[] p;

	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	public String toString() {
		return "nume " + this.nume + " prenume " + this.prenume + " " + varsta;
	}

	public int compareTo(Persoana p) {
		return this.nume.compareTo(p.nume);
	}

}
