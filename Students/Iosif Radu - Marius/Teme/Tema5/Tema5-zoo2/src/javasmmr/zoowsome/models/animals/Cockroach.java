package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cockroach extends Insect {
	public Cockroach(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
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
}
