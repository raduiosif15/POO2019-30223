package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.controllers.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.util.Random;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cockroach extends Insect {
	public Cockroach() {
		super();
		this.name = "Cockroach";
		this.canFly = true;
		this.isDangerous = true;
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Cockroach);
	}
}
