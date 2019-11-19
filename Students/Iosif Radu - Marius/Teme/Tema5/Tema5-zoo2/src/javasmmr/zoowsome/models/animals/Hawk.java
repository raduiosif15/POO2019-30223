package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Hawk extends Bird{
	public Hawk(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		this.name = "Hawk";
		this.nrOfLegs = 2;
		this.migrates = false;
		this.avgFlightAltitude = 30;
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
