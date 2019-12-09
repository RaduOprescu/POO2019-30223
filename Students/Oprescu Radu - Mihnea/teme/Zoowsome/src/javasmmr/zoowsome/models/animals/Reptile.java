package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {
	boolean laysEggs;

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "LaysEggs", String.valueOf(isLaysEggs()));
	}
}