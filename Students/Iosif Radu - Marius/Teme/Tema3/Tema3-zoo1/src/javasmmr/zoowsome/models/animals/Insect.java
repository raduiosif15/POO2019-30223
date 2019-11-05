package javasmmr.zoowsome.models.animals;

public class Insect extends Animal {
	public boolean canFly;
	public boolean isDangerous;

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
}
