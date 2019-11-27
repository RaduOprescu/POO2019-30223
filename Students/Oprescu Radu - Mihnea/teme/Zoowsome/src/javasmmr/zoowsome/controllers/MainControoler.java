package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;


public class MainControoler {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory= new AnimalFactory();
		SpeciesFactory speciesFactory1= abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animals a1= speciesFactory1.getAnimal(Constants.Animals.Mammals.tigru);
		System.out.printf("We have an animal with %d legs", a1.getNrOfLegs());
		
		CareTakerFactory abstractTakers = new CareTakerFactory();

	//eroare la creerea unui angajat	
		Employee employee = abstractTakers.getEmployeeFactory(Constants.Employees.Caretaker);
		employee.setDead(false);
		employee.setNume("Ion");
		
		
	}
	
}
