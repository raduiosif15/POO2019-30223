package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly(0.5, 0);
		} else if (Constants.Animal.Insect.Spider.equals(type)) {
			return new Spider(0.3, 0.1);
		} else if (Constants.Animal.Insect.Cockroach.equals(type)){
			return new Cockroach(0.1, 0);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
}