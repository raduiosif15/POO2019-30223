package hotel;

import java.util.Date;

public class Angajat extends Persoana{

	Date dataAngajare;
	int nrClienti;
	
	public Angajat(int ID, String nume, int nrDeTelefon) {
		super(ID, nume, nrDeTelefon);
	}
	
	public Date getDataAngajare() {
		return this.dataAngajare;
	}
	
	public int getNrClienti() {
		return this.nrClienti;
	}
	
	public void cazeaza(Camera camera, Client client, Angajat angajat, Date dataActuala) {
		int capacitateActuala = camera.getNrDeLocuriDisponibile();
		
		if (capacitateActuala >= 1) {
			camera.persoaneDejaCazate++;
			client.dataCheckIn = dataActuala;
			client.nrCamera = camera.nrCamerei;
			angajat.nrClienti++;
		}
	}
	
	public void decazeaza(Camera camera, Client client, Angajat angajati, Date dataActuala) {
		camera.persoaneDejaCazate--;
		client.dataCheckOut = dataActuala;
		client.nrCamera = -1;
		angajati.nrClienti--;
	}

}
