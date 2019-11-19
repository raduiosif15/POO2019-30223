package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Dolphin extends Aquatic {

	public Dolphin(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Dolphin";
		this.waterType = typeOfWater.saltWater;
		this.nrOfLegs = 0;
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
