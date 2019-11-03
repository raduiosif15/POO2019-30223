
public class Biblioteca {

	private String dataPrimire;
	private String dataRetur;
	private Persoana persoana;
	private Carte carte;
	
	public void ImprumutCarte(String dataPrimire,String dataRetur,Persoana persoana,Carte carte) {
		
		this.dataPrimire = dataPrimire;
		this.dataRetur = dataRetur;
		this.persoana = persoana;
		this.carte = carte;
	}

	public String getDataPrimire() {
		return dataPrimire;
	}
	public void setDataPrimire(String dataPrimire) {
		this.dataPrimire = dataPrimire;
	}

	public String getDataRetur() {
		return dataRetur;
	}
	public void setData_predarii(String dataRetur) {
		this.dataRetur = dataRetur;
	}
	public Persoana getPersoana() {
		return persoana;
	}
	public void setPersoana(Persoana persoana) {
		this.persoana = persoana;
	}
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
	public static void main(String[] args) {
		String dataImp="31.10.2019";
		String dataRetur="12.12.2019";
		Persoana person=new Persoana("Georgiu","Alin","Student",0264,"Strada Sarmisegetuza");
		Carte book=new Carte("Ultima Noapte de Dragoste","Camil Petrescu",158);
		//ImprumutCarte carteImprumutata=new ImprumutCarte(dataImp,dataRetur,person,book);
	}

}
