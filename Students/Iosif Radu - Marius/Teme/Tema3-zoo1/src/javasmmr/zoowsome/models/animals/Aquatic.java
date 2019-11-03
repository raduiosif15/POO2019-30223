package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal {

	public enum typeOfWater {
		saltWater, freshWater
	}

	public Integer avgSwimDepth;
	public typeOfWater waterType;

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
}
