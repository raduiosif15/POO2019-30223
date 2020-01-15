package Model;

import java.util.ArrayList;

public class Reteta {

    protected int nrMedicamente;
    protected ArrayList<Medicament> medicamente;

    public Reteta() {

    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }


    public ArrayList<Medicament> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(ArrayList<Medicament> medicamente) {
        this.medicamente = medicamente;
    }
}
