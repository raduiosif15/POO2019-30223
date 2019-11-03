package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Reptile.Snake.equals(type)) {
			return new Snake();
		} else if (Constants.Animal.Reptile.Crocodile.equals(type)) {
			return new Crocodile();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}