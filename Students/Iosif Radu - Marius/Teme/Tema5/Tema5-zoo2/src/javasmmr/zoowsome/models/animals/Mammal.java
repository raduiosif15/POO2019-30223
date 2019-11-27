package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Mammal extends Animal {
	public double normalBodyTemp;
	public double percBodyHair;

	public Mammal() {
		super();
	}
	
	public void setBodyTemp(double normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public void setPercBodyHair(double percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public double getBodyTemp() {
		return this.normalBodyTemp;
	}

	public double getPercBodyHair() {
		return this.percBodyHair;
	}
	
	@Override
	public boolean kill() {
		return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setBodyTemp(Double.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Double.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
