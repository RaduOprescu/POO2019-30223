package javasmmr.zoowsome.models.animals;

import java.awt.Color;

public abstract class Animals {

	int nrOfLegs;
	String nume = new String();

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setrOfLegs(int nrLegs) {

		this.nrOfLegs = nrLegs;

	}

	public String getName() {

		return nume;

	}

	public void setName(String newNume) {

		this.nume = newNume;

	}

	public abstract class Bird extends Animals {
		boolean migrates;
		int avgFlightAltitude;

	}

	public static abstract class Aquatic extends Animals {
		int avgSwimDepth;

		enum waterType {
			SaltWater, FreshWater;
		}
	}

	public abstract class Insect extends Animals {
		boolean canFly, isDangerous;
	}

	public abstract class Reptile extends Animals {
		boolean laysEggs;
	}

	public abstract class Mammal extends Animals {
		double normalBodyTemp, percBodyHair;
	}

}
