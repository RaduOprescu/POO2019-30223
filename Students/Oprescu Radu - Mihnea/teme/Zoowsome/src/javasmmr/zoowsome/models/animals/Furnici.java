package javasmmr.zoowsome.models.animals;

import java.awt.Color;

import javasmmr.zoowsome.services.factories.Constants;

public abstract class Furnici extends Insect {
	int numar; // cate sunt intr-o colonie
	Color culoare;

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Furnici);
	}

}
