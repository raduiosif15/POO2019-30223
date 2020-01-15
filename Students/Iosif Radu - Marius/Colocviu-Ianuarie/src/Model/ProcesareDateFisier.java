package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProcesareDateFisier {

    public String buf;
    public void citeste(String fisier) {
        int c;
        FileReader f = null;
        try {
            f = new FileReader(fisier);
            while ((c = f.read()) != -1) {
                buf = buf + (char) c;
            }
            f.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit");
        }
        catch (IOException e) {
            System.out.println("Eroare la citire");
        }
    }

    public Pacient procesareDateFisierPacient(String fisier) {
        citeste(fisier); // doar un pacient/fisier :(
        String[] datePacient = buf.split(" ");
        Pacient pacient = new Pacient(datePacient[0], datePacient[1], datePacient[2], datePacient[3]);

        return pacient;
    }

    public Reteta procesareDateFisierReteta(String fisier) {
        citeste(fisier); // doar o reteta/fisier :(
        String[] dateReteta = buf.split(" ");
        Reteta reteta = new Reteta();
        Integer nrMedicamente = new Integer(dateReteta[0]);
        reteta.setNrMedicamente((int) nrMedicamente);

        ArrayList<Medicament> medicamente = new ArrayList<Medicament>();

        for (int i = 0; i < (int) nrMedicamente; i++){
            Medicament medicament = new Medicament();
            medicament.setMedicament(dateReteta[1]);

            medicamente.add(medicament);
        }

        reteta.setMedicamente(medicamente);

        return reteta;
    }

}
