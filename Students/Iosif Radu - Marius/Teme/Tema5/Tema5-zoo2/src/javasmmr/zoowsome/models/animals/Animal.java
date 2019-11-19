package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	public Integer nrOfLegs;
	public String name;
	public boolean takenCareOf;
	public final double maintenanceCost;
	public final double dangerPerc;
	
	public Animal(double maintenaceCost, double dangerPerc) {
		this.maintenanceCost = maintenaceCost;
		this.dangerPerc = dangerPerc;
	}

	public Animal(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = false;
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
}
