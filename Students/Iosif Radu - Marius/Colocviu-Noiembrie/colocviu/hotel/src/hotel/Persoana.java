package hotel;

public class Persoana {
	int ID;
	String nume;
	int nrDeTelefon;
	
	public Persoana() {
		
	}

	public Persoana(int ID, String nume, int nrDeTelefon){
		this.ID = ID;
		this.nume = nume;
		this.nrDeTelefon = nrDeTelefon;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public int getNrDeTelefon() {
		return this.nrDeTelefon;
	}
}
