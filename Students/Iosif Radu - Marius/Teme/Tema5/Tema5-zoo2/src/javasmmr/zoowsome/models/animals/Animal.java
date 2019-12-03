package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javax.swing.text.html.parser.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Animal implements Killer, XML_Parsable {
	public Integer nrOfLegs;
	public String name;
	public boolean takenCareOf;
	public double maintenanceCost;
	public double dangerPerc;
	
	public Animal() {

	}

	public Animal(Integer nrOfLegs, String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.takenCareOf = false;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public void setDangerPerc(double dangerPerc){
		this.dangerPerc = dangerPerc;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getDangerPerc() {
		return this.dangerPerc;
	}
	
	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

    @Override
    public boolean kill() {
        return false;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
        createNode(eventWriter, "name", String.valueOf(this.name));
        createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
        createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
        createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
    }

	@Override
	public void decodeFromXml(Element element) {

	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
