package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Aquatics.crocodil.equals(type))
		{
			return new crocodil();
		}
		else
			if(Constants.Animals.Aquatics.delfin.equals(type))
			{
				return new delfin();
			}
			else
				throw new Exception("Invalid animal exception!");
		
	}

	
}
