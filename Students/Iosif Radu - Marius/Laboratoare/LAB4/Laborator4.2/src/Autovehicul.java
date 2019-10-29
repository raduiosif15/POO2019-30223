import java.util.*;

public class Autovehicul {
	private String marca;
	private String culoare;
	private int vitezaCurenta;
	private int treaptaDeVitezaCurenta;
	private int vitezaMaxima;

	public Autovehicul(String marca, String culoare, int vitezaMaxima) {
		this.marca = marca;
		this.culoare = culoare;
		this.vitezaMaxima = vitezaMaxima;
		this.vitezaCurenta = 0;
		this.treaptaDeVitezaCurenta = 0;
	}

	public Autovehicul() {
		this.marca = "Dacia";
		this.culoare = "Albastru";
		this.vitezaMaxima = 200; // 4.3 constanta caracteristica
		// sper ca am inteles bine cerinta :)
		this.vitezaCurenta = 0;
		this.treaptaDeVitezaCurenta = 0;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getCuloare() {
		return this.culoare;
	}

	public void setMarca(String marcaNoua) {
		this.marca = marcaNoua;
	}

	public void setCuloare(String culoareNoua) {
		this.culoare = culoareNoua;
	}

	public void accelerare() {
		if (this.vitezaCurenta < this.vitezaMaxima)
			this.vitezaCurenta++;
	}

	public void shiftUp() {
		if (this.treaptaDeVitezaCurenta < 5)
			this.treaptaDeVitezaCurenta++;
	}

	public void shiftDown() {
		if (this.treaptaDeVitezaCurenta > 0)
			this.treaptaDeVitezaCurenta--;
	}

	public void decelerare() {
		if (this.vitezaCurenta > 0)
			this.vitezaCurenta--;
	}

	public void pornire() {
		for (int i = 0; i < 10; i++)
			accelerare();
		shiftUp();
	}

	public void oprire() {
		while (this.vitezaCurenta > 0)
			decelerare();
		this.treaptaDeVitezaCurenta = 0;
	}

	public void oprire(int indexIncetinire) {
		while (this.vitezaCurenta > 0) {
			this.vitezaCurenta -= indexIncetinire;
		}
		if (this.vitezaCurenta < 0)
			this.vitezaCurenta = 0;
		this.treaptaDeVitezaCurenta = 0;
	}

	public static void main(String[] args) {
		Autovehicul masinaPersonala = new Autovehicul();

		int count = 0;
		masinaPersonala.pornire();
		System.out.println("Functioneaza " + count);
		count++;
		for (int i = 0; i < 30; i++)
			masinaPersonala.accelerare();
		System.out.println("Functioneaza " + count);
		count++;
		masinaPersonala.shiftUp();
		System.out.println("Functioneaza " + count);
		count++;
		for (int i = 0; i < 40; i++)
			masinaPersonala.accelerare();
		System.out.println("Functioneaza " + count);
		count++;
		masinaPersonala.shiftUp();
		System.out.println("Functioneaza " + count);
		count++;
		masinaPersonala.oprire();
		System.out.println("Functioneaza " + count);
		count++;

		/*
		 * Nu am nici cea mai vaga idee despre ce ar trebui sa afisez ca sa imi dau
		 * seama ca merge si nici cum sa apreciez timpul sau distanta parcursa
		 */

		masinaPersonala.pornire();
		for (int i = 0; i < 30; i++)
			masinaPersonala.accelerare();
		masinaPersonala.shiftUp();
		for (int i = 0; i < 40; i++)
			masinaPersonala.accelerare();
		masinaPersonala.shiftUp();
		System.out.println("Functioneaza " + count);
		count++;
		masinaPersonala.oprire(20);// 4.3 supraincarcare metoda
		System.out.println("Functioneaza " + count);
		count++;
	}
}
