package javasmmr.zoowsome.models.animals;

public class Reptile extends Animal {
	public boolean laysEggs;

	public Reptile(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}
	
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	@Override
	public boolean kill() {
		return false;
	}
}
