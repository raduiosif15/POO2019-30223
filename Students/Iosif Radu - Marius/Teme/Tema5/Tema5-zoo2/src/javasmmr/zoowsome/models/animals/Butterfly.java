package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Butterfly extends Insect {
	public Butterfly(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Butterfly";
		this.canFly = true;
		this.isDangerous = false;
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
