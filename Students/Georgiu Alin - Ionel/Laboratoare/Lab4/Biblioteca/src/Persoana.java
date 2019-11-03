
public class Persoana {
	private String nume;
	private String prenume;
	private String ocupatie;
	private int nrTel;
	private String adresa;
	
	public Persoana(String nume,String prenume,String ocupatie, int nrTel, String adresa) {
		this.nume = nume;
		this.prenume = prenume;
		this.ocupatie=ocupatie;
		this.adresa = adresa;
		this.nrTel=nrTel;
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
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getNrTel() {
		return nrTel;
	}
	public void setNrTel(int nrTel) {
		this.nrTel=nrTel;
	}
}
