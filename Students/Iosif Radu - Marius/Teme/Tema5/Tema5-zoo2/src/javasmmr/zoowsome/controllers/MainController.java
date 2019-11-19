package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

//recunosc ca am "imprumutat" functia main de la Dragos pentru a verifica clasele

public class MainController {
    public static void main(String[] args) throws Exception {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal[] animale = new Animal[5];

        SpeciesFactory speciesFactoryMammal = animalFactory.getSpeciesFactory(Constants.Species.Mammal);
        SpeciesFactory speciesFactoryInsect = animalFactory.getSpeciesFactory(Constants.Species.Insect);
        SpeciesFactory speciesFactoryAquatic = animalFactory.getSpeciesFactory(Constants.Species.Aquatic);
        SpeciesFactory speciesFactoryBird = animalFactory.getSpeciesFactory(Constants.Species.Bird);
        SpeciesFactory speciesFactoryReptile = animalFactory.getSpeciesFactory(Constants.Species.Reptile);
        
        animale[0] = speciesFactoryMammal.getAnimal(Constants.Animal.Mammal.Monkey);
        animale[1] = speciesFactoryReptile.getAnimal(Constants.Animal.Reptile.Snake);
        animale[2] = speciesFactoryAquatic.getAnimal(Constants.Animal.Aquatic.Dolphin);
        animale[3] = speciesFactoryBird.getAnimal(Constants.Animal.Bird.Hawk);        
        animale[4] = speciesFactoryInsect.getAnimal(Constants.Animal.Insect.Butterfly);
        
        printAnimals(animale);

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] employees = new Caretaker[3];

        employees[0] = employeeFactory.getEmployee(Constants.Employee.Caretaker);
        employees[0].setName("Radu");
        employees[0].setId();
        
        employees[1] = employeeFactory.getEmployee(Constants.Employee.Caretaker);
        employees[1].setName("Vlad");
        employees[1].setId();
        while (employees[0].getId() == employees[1].getId()) {
        	employees[1].setId();
        }
        
        employees[2] = employeeFactory.getEmployee(Constants.Employee.Caretaker);
        employees[2].setName("Catalin");
        employees[2].setId();
        while (employees[0].getId() == employees[2].getId() || employees[1].getId() == employees[2].getId()) {
        	employees[2].setId();
        }
        
        printEmployees(employees);

        for (int i = 0; i < employees.length; i++ ) {
        	for (int j = 0; j < animale.length; j++) {
        		if (employees[i].getIsDead() == false && animale[j].getTakenCareOf() == false) {
        			String result = ((Caretaker) employees[i]).takeCareOf(animale[j]);
        			if (result.equals(Constants.Employee.Caretakers.TCO_KILLED)) {
        				employees[i].setIsDead(true);
        			} else if (result.equals(Constants.Employee.Caretakers.TCO_NO_TIME)) {
        				j++;
        			} else {
        				animale[j].setTakenCareOf(true);
        			}
        		}
        	}
        }
        printAnimals(animale);
        printEmployees(employees);
    }

    public static void printAnimals(Animal[] animale) {
    	System.out.println("Animalele sunt: ");
        for (int i = 0; i < animale.length; i++) {
        	if (animale[i].getTakenCareOf() == true) {
        		System.out.println("Animalul este: " + animale[i].getName() + " si s-a avut grija de el.");
        	} else {
        		System.out.println("Animalul este: " + animale[i].getName() + " si nu s-a avut grija de el.");
        	}
        }
        System.out.println();
    }
    
    public static void printEmployees(Employee[] employees) {
        System.out.println("Angajatii sunt: ");
        for (int i = 0; i < employees.length; i++) {
        	if (employees[i].getIsDead() == false) {
        		System.out.println(employees[i].getName() + " ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este viu.");
        	} else {
        		System.out.println(employees[i].getName() + " ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este mort...");
        	}
        }
        System.out.println();
    }
}