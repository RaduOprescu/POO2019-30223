package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animals {
	double normalBodyTemp, percBodyHair;

	public double getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(double normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public double getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(double percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "PercBodyHair", String.valueOf(getPercBodyHair()));
		createNode(eventWriter, "NormalBodyTemp", String.valueOf(getNormalBodyTemp()));
	}
}
