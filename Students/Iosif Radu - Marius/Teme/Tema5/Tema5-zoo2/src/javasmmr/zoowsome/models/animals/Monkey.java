package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Monkey extends Mammal {
	public Monkey(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Monkey";
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
