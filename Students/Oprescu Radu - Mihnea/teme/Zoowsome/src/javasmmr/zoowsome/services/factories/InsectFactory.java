package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Insects.paianjen.equals(type))
		{
			return new Paianjen();
		}
		else
			if(Constants.Animals.Insects.furnici.equals(type))
			{
				return new Furnici();
			}
			else
				throw new Exception("Invalid animal exception!");
	}

	
}
