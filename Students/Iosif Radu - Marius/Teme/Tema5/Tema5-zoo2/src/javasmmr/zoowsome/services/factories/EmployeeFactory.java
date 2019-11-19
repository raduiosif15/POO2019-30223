package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.employees.*;

public class EmployeeFactory extends EmployeeAbstractFactory {
	public Employee getEmployee(String type) {
		if (Constants.Employee.Caretaker.equals(type)) {
			return new Caretaker();
		} else 
			return null;
	}
}
