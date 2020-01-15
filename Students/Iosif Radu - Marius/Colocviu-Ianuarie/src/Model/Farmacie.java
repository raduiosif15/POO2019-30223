package Model;

import java.util.ArrayList;

public class Farmacie {
    protected String nume;
    protected String adresa;
    protected int nrTelefon; // de tipul 743776024
    protected String webSite;
    protected ArrayList<Medicament> medicamente;
    protected ArrayList<Angajat> angajati;

    public Farmacie(String nume, String adresa, int nrTelefon, String webSite) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.webSite = webSite;
    }

    public void removeMedicament(Medicament medicament) {
        medicamente.remove(medicament);
    }

    public void addMedicament(Medicament medicament) {
        medicamente.add(medicament);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(int nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public ArrayList<Medicament> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(ArrayList<Medicament> medicamente) {
        this.medicamente = medicamente;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Angajat> angajati) {
        this.angajati = angajati;
    }
}
