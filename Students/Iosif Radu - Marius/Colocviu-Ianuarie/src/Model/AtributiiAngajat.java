package Model;

public interface AtributiiAngajat {
    public void adaugareMedicamente(String numeMedicament, int stoc, Farmacie farmacie);
    public void eliminareMedicamente(String numeMedicament, Farmacie farmacie);
    public int verificareStocMedicament(Medicament medicament);
    public boolean cautareMedicament(Medicament medicament, Farmacie farmacie);
    public float procesareReteta(Farmacie farmacie, Reteta reteta);
}
