package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Whale extends Aquatic {
	public Whale(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Whale";
		this.nrOfLegs = 0;
		this.waterType = typeOfWater.saltWater;
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
