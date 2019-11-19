package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal {

	public enum typeOfWater {
		saltWater, freshWater
	}

	public Integer avgSwimDepth;
	public typeOfWater waterType;
	
	public Aquatic(double maintenaceCost, double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public void setWaterType(typeOfWater waterType) {
		this.waterType = waterType;
	}

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public typeOfWater getWaterType() {
		return this.waterType;
	}

	@Override
	public boolean kill() {
		return false;
	}
}
