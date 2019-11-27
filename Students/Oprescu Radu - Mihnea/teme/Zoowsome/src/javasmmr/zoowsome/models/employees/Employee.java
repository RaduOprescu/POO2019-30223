package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.*;

public abstract class Employee {

	private String nume;
	private long id = (long) Math.floor(Math.random() * 9000000000000l) + 1000000000000l;
	private BigDecimal salar;
	private boolean isDead;

	// constructori pt clasa employee

	public Employee(String numeAngajat, BigDecimal salarAngajat, boolean dead) {
		nume = numeAngajat;
		salar = salarAngajat;
		isDead = dead;

	}

	public Employee() {
		isDead = false;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String numeAngajat) {
		nume = numeAngajat;
	}

	public long getId() {
		return id;
	}

	public void setId(long idAngajat) {
		id = idAngajat;
	}

	public BigDecimal getSalar() {
		return salar;
	}

	public void setSalar(BigDecimal salarAngajat) {
		salar = salarAngajat;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean dead) {
		isDead = dead;
	}

}
