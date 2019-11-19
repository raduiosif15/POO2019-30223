package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Hen extends Bird {
	public Hen(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Hen";
		this.nrOfLegs = 2;
		this.migrates = false;
		this.avgFlightAltitude = 1;
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
