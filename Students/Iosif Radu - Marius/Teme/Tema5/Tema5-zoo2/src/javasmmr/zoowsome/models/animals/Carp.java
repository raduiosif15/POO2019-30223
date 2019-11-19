package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Carp extends Aquatic {
	public Carp(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Carp";
		this.nrOfLegs = 0;
		this.waterType = typeOfWater.freshWater;
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
}
