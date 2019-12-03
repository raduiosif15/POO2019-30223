package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.models.animals.Animal;

import java.math.BigDecimal;

public class Caretaker extends Employee implements Caretaker_I{
	public double workingHours;
	
	public Caretaker() {
		super();
		this.workingHours = 8.0;
	}
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public double getWorkingHours() {
		return this.workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if (this.isDead == false) {
			if (animal.takenCareOf == false) {
				if (animal.kill() == true) {
					this.isDead = true;
					return Constants.Employee.Caretakers.TCO_KILLED;
				} else if (this.workingHours > animal.maintenanceCost) {
					this.workingHours -= animal.maintenanceCost;
					return Constants.Employee.Caretakers.TCO_SUCCES;
				} else {
					return Constants.Employee.Caretakers.TCO_NO_TIME;
				}
			}
		}
		return null;
	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setWorkingHours(Integer.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
