package hotel;


public class Hotel {
	
	Camera[] camere;
	Angajat[] angajati;
	Client[] clienti;
	int nrAngajati;
	int nrClienti;
	
	
	public Hotel() {
		this.camere[0] = new Camera(110, 1, 200, 20);
		this.camere[1] = new Camera(101, 3, 50, 20);
		this.camere[2] = new Camera(102, 3, 50, 20);
		this.camere[3] = new Camera(103, 4, 45, 15);
		this.camere[4] = new Camera(104, 4, 45, 15);
		this.camere[5] = new Camera(201, 3, 50, 20);
		this.camere[6] = new Camera(202, 3, 50, 20);
		this.camere[7] = new Camera(203, 4, 45, 15);
		this.camere[8] = new Camera(204, 4, 45, 15);
		this.camere[9] = new Camera(301, 7, 40, 10);
		this.camere[10] = new Camera(302, 7, 40, 10);
		
		this.angajati[0] = new Angajat(100, "Cristi", 727189182);
		this.angajati[1] = new Angajat(101, "Vasile", 732446999);
		this.angajati[2] = new Angajat(102, "Ion", 743776024);
		this.angajati[3] = new Angajat(103, "Popescu", 743125689);
		this.angajati[4] = new Angajat(104, "Ilie", 735664759);
		this.angajati[5] = new Angajat(105, "Vladimir", 732624899);
		this.angajati[6] = new Angajat(106, "Tudor", 732447568);
		
		this.clienti[0] = new Client(199, "nume1", 745681236, 100, true);
		this.clienti[1] = new Client(100, "nume2", 745656436, 101, false);
		this.clienti[2] = new Client(101, "nume3", 745678936, 101, false);
		this.clienti[3] = new Client(102, "nume4", 745612336, 101, false);
		this.clienti[4] = new Client(103, "nume5", 745684566, 102, false);
		this.clienti[5] = new Client(104, "nume6", 745687894, 102, false);
		this.clienti[6] = new Client(105, "nume7", 745681123, 103, true);
		this.clienti[7] = new Client(106, "nume8", 745681753, 104, false);
		this.clienti[8] = new Client(107, "nume9", 745615936, 104, false);
		this.clienti[9] = new Client(108, "nume10", 745682586, 201, true);
		this.clienti[10] = new Client(109, "nume11", 745686456, 203, false);
		this.clienti[11] = new Client(110, "nume12", 745687896, 203, false);
		this.clienti[12] = new Client(111, "nume13", 741231236, 203, false);
		this.clienti[13] = new Client(112, "nume14", 745321236, 203, false);
		this.clienti[14] = new Client(113, "nume15", 747891236, 302, false);
		this.clienti[15] = new Client(114, "nume16", 744561236, 302, false);
		this.clienti[16] = new Client(115, "nume17", 747126236, 302, false);
		this.clienti[17] = new Client(116, "nume18", 747899236, 302, false);
		this.clienti[18] = new Client(117, "nume19", 799999236, 302, false);
		this.clienti[19] = new Client(118, "nume20", 747123457, 302, false);
		
		this.nrAngajati = 7;
		this.nrClienti = 20;
	}

	public void adaugareAngajat(int ID, String nume, int nrDeTelefon) {
		this.nrAngajati++;
		this.angajati[this.nrAngajati] = new Angajat(ID, nume, nrDeTelefon);
	}
	
	public void adaugareClienti(int ID, String nume, int nrDeTelefon, int nrCamera, boolean regimSingle) {
		this.nrClienti++;
		this.clienti[this.nrClienti] = new Client(ID, nume, nrDeTelefon, nrCamera, regimSingle);
	}
	
	public void facturaClienti(int clientID, int angajatID, int nrCamera, boolean regimSingle, int nrDeNopti) {
		int indexClient = 0;
		int indexAngajat = 0;
		int indexCamera = 0;
		
		while (this.clienti[indexClient].ID != clientID)
			indexClient++;
		
		while (this.angajati[indexAngajat].ID != angajatID)
			indexAngajat++;
		
		while (this.camere[indexCamera].nrCamerei != nrCamera)
			indexCamera++;
		
		
		int pret = this.camere[indexCamera].calcularePret(nrDeNopti, regimSingle);
	}
	
}
