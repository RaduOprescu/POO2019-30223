package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Reptiles.soparla.equals(type))
		{
			return new Soparla();
		}
		else
			if(Constants.Animals.Reptiles.sarpe.equals(type))
			{
				return new Sarpe();
			}
			else
				throw new Exception("Invalid animal exception!");
	}
	
	
}
