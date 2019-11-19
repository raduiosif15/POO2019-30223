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
			return new Whale(5.0, 0.4);
		} else if (Constants.Animal.Aquatic.Carp.equals(type)) {
			return new Carp(1.0, 0);
		} else if (Constants.Animal.Aquatic.Dolphin.contentEquals(type)) {
			return new Dolphin(3.0, 0.1);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}