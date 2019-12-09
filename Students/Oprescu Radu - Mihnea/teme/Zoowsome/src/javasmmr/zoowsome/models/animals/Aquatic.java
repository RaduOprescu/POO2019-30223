package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals {
	int avgSwimDepth;

	enum waterType {
		SaltWater, FreshWater;
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
	}

}