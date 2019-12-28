public class Student {
    public String nume;
    public String prenume;
    public Masina masina;

    public Student(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Masina getMasina() {
        return masina;
    }
}
