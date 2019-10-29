import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		int number = 95935;
		int suma1 = 0;

		for (int i = 3; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma1 += i;
			}
		}

		System.out.println("Suma este : " + suma1);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dati numarul : (Limita pentru suma int este 95935)");
		int Number1 = scanner.nextInt();
		int suma2 = 0;

		for (int i = 3; i < Number1; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				suma2 += i;
		}

		System.out.println("Suma numerelor divizibile cu 3 si 5 pana la numarul " + Number1 + " este :" + suma2);

	}

}
