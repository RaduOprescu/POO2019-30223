package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Insects.paianjen.equals(type))
		{
			return new paianjen();
		}
		else
			if(Constants.Animals.Insects.furnici.equals(type))
			{
				return new furnici();
			}
			else
				throw new Exception("Invalid animal exception!");
	}

	
}
