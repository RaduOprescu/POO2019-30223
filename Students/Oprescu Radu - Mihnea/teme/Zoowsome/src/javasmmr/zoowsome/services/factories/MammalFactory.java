package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

	public Animals getAnimal(String type) {
		if(Constants.Animals.Mammals.tigru.equals(type))
		{
			return new tigru();
		}
		else
			if(Constants.Animals.Mammals.arici.equals(type))
			{
				return new arici();
			}
			else
			{
				throw new Exception("Invalid animal exception!");
			}
	}
	
	
}
