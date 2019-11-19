package javasmmr.zoowsome.models.animals;

public class Bird extends Animal {
	public boolean migrates;
	public Integer avgFlightAltitude;
	
	public Bird(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public boolean getMigrates() {
		return this.migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	@Override
	public boolean kill() {
		return false;
	}
}
