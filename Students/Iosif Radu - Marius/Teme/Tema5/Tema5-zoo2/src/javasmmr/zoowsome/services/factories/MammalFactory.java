package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Mammal.Cow.equals(type)) {
			return new Cow(2.0, 0);
		} else if (Constants.Animal.Mammal.Tiger.equals(type)) {
			return new Tiger(3.0, 0.9);
		} else if (Constants.Animal.Mammal.Monkey.contentEquals(type)){
			return new Monkey(1.5, 0.1);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}
