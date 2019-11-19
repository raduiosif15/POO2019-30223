package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Spider extends Insect{
	public Spider(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Spider";
		this.canFly = false;
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
