
import java.awt.Color;
import java.lang.Math;

public class Autovehicul {
	public Autovehicul() {

	}

	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaCurenta;
	private int vitezaMaxima;
	private final int nrLocuri = 5;
	
	public Autovehicul(String marcaM, Color culoareM, int viteza, int treapta, int vitezaMax) {
		this.marca = marcaM;
		this.culoare = culoareM;
		this.vitezaCurenta = viteza;
		this.treaptaCurenta = treapta;
		this.vitezaMaxima = vitezaMax;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marcaM) {
		this.marca = marcaM;
	}

	public Color getColor() {
		return culoare;
	}

	public void setColor(Color culoareM) {
		this.culoare = culoareM;
	}

	public int getVitezaCurenta() {
		return vitezaCurenta;
	}

	public void setVitezaCurenta(int viteza) {
		if (viteza >= 0) {
			this.vitezaCurenta = viteza;
		} else {
			this.vitezaCurenta = Math.abs(viteza);
		}
	}

	public int getVitezaMaxima() {
		return vitezaMaxima;
	}

	public int getVitezaMaxima(int viteza) {
		if (viteza > vitezaMaxima) {
			this.vitezaMaxima = viteza;
		}
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMax) {
		this.vitezaMaxima = vitezaMax;
	}

	public void accelereaza(int nrKm_h) {
		setVitezaCurenta(vitezaCurenta + nrKm_h);
	}

	public void decelereaza(int nrKm_h) {
		setVitezaCurenta(vitezaCurenta - nrKm_h);
	}

	public int getTreaptaCurenta() {
		return treaptaCurenta;
	}

	public void setTreaptaCurenta(int treapta) {
		if (treapta >= 1 && treapta <= 6) {
			this.treaptaCurenta = treapta;
		}
		if (treapta == 0) {
			System.out.println("Masina se afla in N");
		} else {
			System.out.println("Masina se afla in R");
		}
	}

	public void schimbaTreapta(int treapta) {
		setTreaptaCurenta(treapta);
	}

	public void stopCar() {
		setVitezaCurenta(0);
		setTreaptaCurenta(0);
		System.out.println("Masina tomcai s-a oprit");
	}

	public static void laDrum(Autovehicul car) {
		System.out.println(car.getVitezaCurenta());
		car.accelereaza(30);
		car.schimbaTreapta(2);
		System.out.println(car.getTreaptaCurenta());
		System.out.println(car.getVitezaCurenta());
		car.decelereaza(5);
		System.out.println(car.getVitezaCurenta());
		car.decelereaza(20);
		car.schimbaTreapta(0);
		car.stopCar();
	}

	public static void main(String[] args) {
		Autovehicul car = new Autovehicul("Ligier X", Color.DARK_GRAY, 0, 2, 210);
		//Sofer sof=new Sofer("Georgiu","Alin",22,12323);
		 Sofer sofer = new Sofer("Georgiu","Alin",20,23232);
		 DatePersonaleSofer date= new DatePersonaleSofer("B",5,2,"Este un sofer bun");
		 DotariMasina dotari =new DotariMasina(0,1,1);
		// laDrum(car);
	}

}
