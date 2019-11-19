package javasmmr.zoowsome.models.animals;

public class Insect extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	
	public Insect(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public boolean getCanFly() {
		return this.canFly;
	}

	public boolean getIsDangerous() {
		return this.isDangerous;
	}
	
	@Override
	public boolean kill() {
		return false;
	}
}
