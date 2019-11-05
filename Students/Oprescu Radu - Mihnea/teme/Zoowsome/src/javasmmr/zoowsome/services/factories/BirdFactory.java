package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Birds.papagal.equals(type))
		{
			return new papagal();
		}
		else
			if(Constants.Animals.Birds.pelican.equals(type))
			{
				return new pelican();
			}
			else
				throw new Exception("Invalid animal exception!");
	}
	
}
