package Model;

import java.util.ArrayList;
import java.util.Date;

public class Angajat implements AtributiiAngajat{
    protected String nume;
    protected int nrRetete;
    protected int id;
    protected Date dataAngajarii;
    protected float bonusSalariu;

    public Angajat() {

    }

    @Override
    public void adaugareMedicamente(String numeMedicament, int stoc, Farmacie farmacie) {
        Medicament medicament = new Medicament();
        medicament.setMedicament(numeMedicament);
        medicament.setStocMedicament(stoc);
        farmacie.addMedicament(medicament);
    }

    @Override
    public void eliminareMedicamente(String numeMedicament, Farmacie farmacie) {
        Medicament medicament = new Medicament();
        medicament.setMedicament(numeMedicament);
        farmacie.removeMedicament(medicament);
    }

    @Override
    public int verificareStocMedicament(Medicament medicament) {
        return medicament.getStocMedicament();
    }

    @Override
    public boolean cautareMedicament(Medicament medicament, Farmacie farmacie) {
        return farmacie.getMedicamente().contains(medicament);
    }

    @Override
    public float procesareReteta(Farmacie farmacie, Reteta reteta) {
        int nrMedicamente = reteta.getNrMedicamente();
        float costReteta = 0;

        for (int i = 0; i < nrMedicamente; i++) {
            if (cautareMedicament(reteta.getMedicamente().get(i), farmacie)) {
                int stoc = verificareStocMedicament(reteta.getMedicamente().get(i));
                if (stoc > 0) {
                    reteta.getMedicamente().get(i).setStocMedicament(stoc - 1);
                    costReteta += reteta.getMedicamente().get(i).getPretMedicament();
                }
            }
        }

        this.bonusSalariu += (0.15 * costReteta) / 100;

        return costReteta;
    }
}
