package Controller;

import Model.Farmacie;
import Model.Medicament;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        Farmacie farmacie1 = new Farmacie("Richtter", "Gherla", 743776024, "www.farmaciarichtter.ro");
        Medicament medicamente1 = new Medicament();
        medicamente1.setMedicament("Algocalmin");
        medicamente1.setStocMedicament(3);
        medicamente1.setPretMedicament((float) 1.5);
        Medicament medicamente2 = new Medicament();
        medicamente2.setMedicament("Paracetamol");
        medicamente2.setStocMedicament(2);
        medicamente2.setPretMedicament((float) 3);
        Medicament medicamente3 = new Medicament();
        medicamente3.setMedicament("Nurofen");
        medicamente3.setStocMedicament(4);
        medicamente3.setPretMedicament((float) 2.4);
        Medicament medicamente4 = new Medicament();
        medicamente4.setMedicament("Triferment");
        medicamente4.setStocMedicament(5);
        medicamente4.setPretMedicament((float) 6.5);
        ArrayList<Medicament> medicamente;
        medicamente = new ArrayList<Medicament>();
        medicamente.add(medicamente1);
        medicamente.add(medicamente2);
        medicamente.add(medicamente3);
        medicamente.add(medicamente4);
        farmacie1.setMedicamente(medicamente);
    }
}
