package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cow extends Mammal {
	public Cow(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Cow";
		this.nrOfLegs = 4;
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
