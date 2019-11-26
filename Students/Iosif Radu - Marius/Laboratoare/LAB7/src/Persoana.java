public class Persoana implements Comparable {
    public String nume;
    public String prenume;
    public int varsta;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setPrenume(String prenume){
        this.prenume = prenume;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public String getNume(){
        return this.nume;
    }

    public String getPrenume(){
        return this.prenume;
    }

    public int getVarsta(){
        return this.varsta;
    }

    @Override
    public int compareTo(Object o) {
        Persoana persoanaAux = (Persoana) o;
        if (this.nume.compareTo(persoanaAux.nume) == 0) {
            return this.prenume.compareTo(persoanaAux.prenume);
        }

        return this.nume.compareTo(persoanaAux.nume);
    }

    @Override
    public String toString() {
        return this.nume + " " + this.prenume;
    }
}
