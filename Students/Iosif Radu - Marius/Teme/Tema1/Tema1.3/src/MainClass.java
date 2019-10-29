import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Numarul de cifre este: ");

		int numberOfDigits = scanner.nextInt();

		int valMin = 1;

		for (int i = 1; i < numberOfDigits; i++)
			valMin *= 10;

		int valMax = valMin * 10 - 1;
		int ok = 1;
		
		int numarObtinut = 0;
		int contor1 = 0;
		int contor2 = 0;

		for (contor1 = valMax; ok == 1 && contor1 >= valMin; contor1--) {
			for (contor2 = valMax; ok == 1 && contor2 >= valMin; contor2--) {
				numarObtinut = contor1 * contor2;
				if (isPalindrom(numarObtinut) == 1)
					ok = 0;
			}
		}

		if (ok == 1)
			{
			System.out.println("Nu s-a gasit palindrom format din produsul a 2 numere de " + numberOfDigits + " cifre.");
			}
		else {
			
			System.out.println(numarObtinut);
			System.out.println(++contor1);
			System.out.println(" ");
			System.out.println(++contor2);
		}

	}

	public static int isPalindrom(int number) {
		int number1 = number;
		int invers = 0;

		while (number1 > 0) {
			invers = invers * 10 + number1 % 10;
			number1 /= 10;
		}

		if (invers == number)
			return 1;
		else
			return 0;
	}

}
