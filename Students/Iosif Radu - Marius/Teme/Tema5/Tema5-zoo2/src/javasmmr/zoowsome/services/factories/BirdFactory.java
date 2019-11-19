package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dove;
import javasmmr.zoowsome.models.animals.Hawk;
import javasmmr.zoowsome.models.animals.Hen;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Bird.Hawk.equals(type)) {
			return new Hawk(1.0, 0.3);
		} else if (Constants.Animal.Bird.Dove.equals(type)) {
			return new Dove(1.0, 0);
		} else if (Constants.Animal.Bird.Hen.equals(type)){
			return new Hen(1.0, 0);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}