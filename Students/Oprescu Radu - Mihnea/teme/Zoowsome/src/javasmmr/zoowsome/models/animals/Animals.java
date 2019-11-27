package javasmmr.zoowsome.models.animals;

import java.awt.Color;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;



public abstract class Animals {

	int nrOfLegs;
	String nume = new String();

	double dangerPerc;
	double costIntretinere;

	private boolean takenCareOf = false;

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

	public double getCostIntretinere() {
		return costIntretinere;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public void setCostIntretinere(double cost) {
		costIntretinere = cost;
	}

	public void setDangerPerc(double danger) {
		dangerPerc = danger;
	}

	public boolean kill() {
		if (Math.random() < dangerPerc)
			return true;
		else
			return false;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCare) {
		takenCareOf = takenCare;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.nume));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.costIntretinere));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	
}
