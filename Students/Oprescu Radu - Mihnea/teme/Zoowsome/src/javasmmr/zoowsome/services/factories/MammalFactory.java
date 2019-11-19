package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Mammals.tigru.equals(type))
		{
			return new Tigru();
		}
		else
			if(Constants.Animals.Mammals.arici.equals(type))
			{
				return new Arici();
			}
			else
			{
				throw new Exception("Invalid animal exception!");
			}
	}
	
	
}
