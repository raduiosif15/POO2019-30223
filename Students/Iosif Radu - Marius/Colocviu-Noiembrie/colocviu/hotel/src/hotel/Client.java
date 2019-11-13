package hotel;

import java.util.Date;

public class Client extends Persoana {

	int nrCamera = -1;
	Date dataCheckIn;
	Date dataCheckOut;
	boolean regimSingle = false;
	
	public Client(int ID, String nume, int nrDeTelefon, int nrCamera, boolean regimSingle) {
		super(ID, nume, nrDeTelefon);
		this.nrCamera = nrCamera;
		this.regimSingle = regimSingle;
	}
	
	public int getNrCamera() {
		return this.nrCamera;
	}
	
	public Date getDataCheckIn() {
		return this.dataCheckIn;
	}
	
	public Date getDataCheckOut() {
		return this.dataCheckOut;
	}
}
