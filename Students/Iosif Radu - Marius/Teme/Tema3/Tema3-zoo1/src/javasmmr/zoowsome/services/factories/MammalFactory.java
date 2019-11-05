package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Mammal.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animal.Mammal.Tiger.equals(type)) {
			return new Tiger();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}
