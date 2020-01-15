package Model;

public class Medicament {
    protected String medicament;
    protected int stocMedicament;
    protected float pretMedicament;

    public float getPretMedicament() {
        return pretMedicament;
    }

    public void setPretMedicament(float pretMedicament) {
        this.pretMedicament = pretMedicament;
    }

    public Medicament() {
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public int getStocMedicament() {
        return stocMedicament;
    }

    public void setStocMedicament(int stocMedicament) {
        this.stocMedicament = stocMedicament;
    }
}
