package javasmmr.zoowsome.models.animals;

import java.awt.Color;

public abstract class Animals {
	
	
	int nrOfLegs;
	String nume= new String();
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setrOfLegs(int nrLegs) {
		
		this.nrOfLegs= nrLegs;
		
	}

	public String getName() {
		
		return nume;
		
	}
	
	public void setName(String newNume) {
		
		this.nume=newNume;
		
	}
	

	public abstract class Bird extends Animals {
		boolean migrates;
		int avgFlightAltitude;

	}

	public static abstract class Aquatic extends Animals {
		int avgSwimDepth;
		enum waterType{
			SaltWater,FreshWater;
		}
	}

	public abstract class Insect extends Animals {
		boolean canFly,isDangerous;
	}

	public abstract class Reptile extends Animals {
		boolean laysEggs;
	}

	public abstract class Mammal extends Animals {
		double normalBodyTemp, percBodyHair;
	}
	

	
	public abstract class maimuta extends Mammal{
		int age;
		int ultimaMasa;
	}
	
	public abstract class arici extends Mammal{
		int age;
		int ultimaMasa;
	}
	
	public abstract class papagal extends Bird{
		int age;
		int ultimaMasa;
		Color culoare;
	}
	
	public abstract class pelican extends Bird{
		int age;
		int ultimaMasa;
		Color culoare;
	}
	
	public abstract class fazan extends Bird{
		int age;
		int ultimaMasa;
		Color culoare;
	}
	
	public abstract class caracatita extends Aquatic{
		int age;
		int nrTentacule; // in caz ca in urma unui accident a ramas fara unul(putin fortat, dar nu mi-a venit alt atribut)		
	}
	
	public abstract class crocodil extends Aquatic{
		int age;
		int ultimaMasa;
		boolean mascul;
	}
	
	public abstract class delfin extends Aquatic{
		int age;
		int ultimaMasa;
		boolean dresat;
	}
	
	public abstract class paianjen extends Insect{
		int age;
		String specie;
	}
	
	public abstract class furnici extends Insect{
		int numar; // cate sunt intr-o colonie
		Color culoare;
	}
	
	public abstract class buburuza extends Insect{
		int age;
		int NrPete;
	}
	
	public abstract class sarpe extends Reptile{
		int age;
		String tip;
	}
	
	public abstract class soparla extends Reptile{
		int age;
		Color culoare;
	}
	
	public abstract class cameleon extends Reptile{
		int age;
		Color ultimaCuloare;
	}
	

}
