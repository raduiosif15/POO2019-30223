package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animal.Insect.Spider.equals(type)) {
			return new Spider();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}