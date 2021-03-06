package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTakerFactory extends EmployeeAbsFactory {

	public Employee getEmployeeFactory(String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			return new CareTaker();
		} else {
			System.out.println("Invalid employee exception");
			return null;
		}
	}

}
