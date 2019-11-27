package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.controllers.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.util.Random;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Dove extends Bird {
	public Dove() {
		super();
		this.name = "Dove";
		this.migrates = false;
		this.avgFlightAltitude = 20;
		this.nrOfLegs = 2;
	}
	
	@Override
	public boolean kill() {
		Random rand = new Random();
		double randomValue = rand.nextDouble();
		if (randomValue < this.getDangerPerc()) {
			return true;
		}
		return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Dove);
	}
}
