package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.*;

public abstract class EmployeeAbstractFactory {

	public abstract Employee getEmployee(String type);
	
}
