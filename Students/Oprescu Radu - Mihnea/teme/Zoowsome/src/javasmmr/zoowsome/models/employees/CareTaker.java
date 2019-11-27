package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.*;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTaker extends Employee {

	double oreLucrate;

	public double getOreLucrate() {
		return oreLucrate;
	}

	public void setOreLucrate(double oreLucrateA) {
		oreLucrate = oreLucrateA;
	}

	public String takeCareOf(Animals animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.oreLucrate < animal.getCostIntretinere()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;

		}
		animal.setTakenCareOf(false);
		setOreLucrate(getOreLucrate() - animal.getCostIntretinere());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
