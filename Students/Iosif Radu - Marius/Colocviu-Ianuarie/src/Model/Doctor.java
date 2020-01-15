package Model;

import java.util.ArrayList;
import java.util.Random;

public class Doctor implements AtributiiDoctor {

    @Override
    public void stabilireDiagnostic(Pacient pacient) {
        Random rand = new Random();
        int tipDeBoala = rand.nextInt(2) + 1;
        pacient.setTipDeBoala(tipDeBoala);
    }

    @Override
    public void creareReteta(Pacient pacient) {
        if (pacient.getTipDeBoala() == 1) {
            Reteta reteta = new Reteta();
            reteta.setNrMedicamente(2);
            ArrayList<Medicament> medicamente = new ArrayList<Medicament>();
            Medicament med1 = new Medicament();
            Medicament med2 = new Medicament();
            med1.setMedicament("Algocalmin");
            med2.setMedicament("Paracetamol");
            medicamente.add(med1);
            medicamente.add(med2);
            reteta.setMedicamente(medicamente);
            pacient.setReteta(reteta);
        } else if (pacient.getTipDeBoala() == 2) {
            Reteta reteta = new Reteta();
            reteta.setNrMedicamente(3);
            ArrayList<Medicament> medicamente = new ArrayList<Medicament>();
            Medicament med1 = new Medicament();
            Medicament med2 = new Medicament();
            Medicament med3 = new Medicament();
            med1.setMedicament("Triferment");
            med2.setMedicament("Nurofen");
            med3.setMedicament("Aspirina"); // nu stiu alte nume de medicamente :)
            medicamente.add(med1);
            medicamente.add(med2);
            medicamente.add(med3);
            pacient.setReteta(reteta);
        }
    }
}
