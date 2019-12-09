package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

public abstract class Paianjen extends Insect {
	int age;
	String specie;

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.paianjen);
	}
}
