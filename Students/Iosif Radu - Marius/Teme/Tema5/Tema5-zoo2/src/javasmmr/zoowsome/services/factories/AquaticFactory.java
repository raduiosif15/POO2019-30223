package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Carp;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Aquatic.Whale.equals(type)) {
			return new Whale();
		} else if (Constants.Animal.Aquatic.Carp.equals(type)) {
			return new Carp();
		} else if (Constants.Animal.Aquatic.Dolphin.contentEquals(type)) {
			return new Dolphin();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}