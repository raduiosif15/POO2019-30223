package javasmmr.zoowsome.models.animals;

public class Mammal extends Animal {
	public double normalBodyTemp;
	public double percBodyHair;

	public Mammal(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}
	
	public void setBodyTemp(double normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public void setPercBodyHair(double percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public double getBodyTemp() {
		return this.normalBodyTemp;
	}

	public double getPercBodyHair() {
		return this.percBodyHair;
	}
	
	@Override
	public boolean kill() {
		return false;
	}
}
