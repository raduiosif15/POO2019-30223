package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Reptile extends Animal {
	public boolean laysEggs;

	public Reptile() {
		super();
	}
	
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	@Override
	public boolean kill() {
		return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
