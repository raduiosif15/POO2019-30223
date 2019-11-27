package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Aquatic extends Animal {

	public enum typeOfWater {
		saltWater, freshWater
	}

	public Integer avgSwimDepth;
	public typeOfWater waterType;
	
	public Aquatic() {
		super();
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public void setWaterType(typeOfWater waterType) {
		this.waterType = waterType;
	}

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public typeOfWater getWaterType() {
		return this.waterType;
	}

	@Override
	public boolean kill() {
		return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(typeOfWater.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
