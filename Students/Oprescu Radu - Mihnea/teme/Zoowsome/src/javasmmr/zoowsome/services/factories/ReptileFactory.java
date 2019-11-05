package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Reptiles.soparla.equals(type))
		{
			return new soparla();
		}
		else
			if(Constants.Animals.Reptiles.sarpe.equals(type))
			{
				return new sarpe();
			}
			else
				throw new Exception("Invalid animal exception!");
	}
	
	
}
