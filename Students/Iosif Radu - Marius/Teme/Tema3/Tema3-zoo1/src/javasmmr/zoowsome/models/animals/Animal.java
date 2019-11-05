package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	public Integer nrOfLegs;
	public String name;

	public Animal() {
	}

	public Animal(Integer nrOfLegs, String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
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
}
