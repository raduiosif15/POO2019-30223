package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Dove extends Bird {
	public Dove(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Dove";
		this.migrates = false;
		this.avgFlightAltitude = 20;
		this.nrOfLegs = 2;
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
