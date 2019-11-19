package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Snake extends Reptile {
	public Snake(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Snake";
		this.laysEggs = true;
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
