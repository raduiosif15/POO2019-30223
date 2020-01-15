package Model;

import java.util.Random;

public class Pacient {
    protected String nume;
    protected String prenume;
    protected String varsta;
    protected String sex;
    protected int tipDeBoala; // 1 - afectiune cronica; 2 - afectiune acuta;
    protected float gradDeSeveritate;
    protected Reteta reteta;

    public Pacient(String nume, String prenume, String varsta, String sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTipDeBoala() {
        return tipDeBoala;
    }

    public float getGradDeSeveritate() {
        return gradDeSeveritate;
    }

    public void setTipDeBoala(int tipDeBoala) {
        this.tipDeBoala = tipDeBoala;
    }

    public void setGradDeSeveritate() {
        this.gradDeSeveritate = reteta.getNrMedicamente() / 10;
    }

    public Reteta getReteta() {
        return reteta;
    }

    public void setReteta(Reteta reteta) {
        this.reteta = reteta;
    }
}
