import java.math.BigInteger;
import java.lang.Math; 
import java.util.*;

public class Consola {

	static void afisareNumereConsola() {

		int nrInt;
		float nrFloat;
		double nrDouble;

		Scanner in = new Scanner(System.in);

		nrInt = in.nextInt();
		System.out.println("You entered the integer number " + nrInt);
		nrFloat = in.nextFloat();
		System.out.println("You entered the real number " + nrFloat);
		nrDouble = in.nextDouble();
		System.out.println("You entered the real double number " + nrDouble);
	}

	static void integerLimits() {

		int integerMaximValue = Integer.MAX_VALUE;
		double realMaximValue = Double.MAX_VALUE;
		// integerMaximValue += 3;
		// realMaximValue += 7;

		BigInteger nr1, nr2;

		nr1 = BigInteger.valueOf(Integer.MAX_VALUE); // se initializeaza nr1 cu Max_Value
		nr2 = BigInteger.valueOf(300); // se initializeaza nr2 cu 300
		nr1 = nr1.add(nr2); // la nr1 se aduna nr2
		System.out.println("Value for nr1 " + nr1);

		System.out.println("Maximum int value " + integerMaximValue);
		System.out.println("Maxim double value " + realMaximValue);

	}

	static void catchError() {

		int val;

		String s = "43"; // "Marea Albastra" => Eroare ...
		try {
			val = Integer.parseInt(s);
		} catch (NumberFormatException nx) {
			System.out.println("A intervenit o eroare neasteptata");
		}
	}
	
	static BigInteger power(int n) {
		BigInteger f;
		f = BigInteger.valueOf(1);
		for(int i = 1; i<= n ; i++) {
			f = f.multiply(BigInteger.valueOf(2));
		}
		return f;
	}

	static void problemaBoabelor() {
		
		int n = 8; // o tabla de sah este o matrice 8x8
		BigInteger totalBoabe = BigInteger.valueOf(1);
		int nrCasute = n*n;
		for(int i=2; i<= nrCasute; i++) {
  
			BigInteger nrBoabeCasuta = power(i);
			totalBoabe = totalBoabe.add(nrBoabeCasuta) ;
		}
		System.out.println(totalBoabe);
	}

	public static void main(String[] args) {
		// afisareNumereConsola();
		// integerLimits();
		// catchError();
		problemaBoabelor() ;
		/*float nr1;
		double nr2;
		nr2 = Math.PI;
		nr1 = 25;

		nr2 *= nr1;
		nr1 /= 5.23;

		System.out.printf("Numar corect de zecimale %.6e\n", nr1);
		System.out.printf("Numar de zecimale in exces %.9f\n", nr1);

		System.out.printf("Numar corect de zecimale %.15e\n", nr2);
		System.out.printf("Numar de zecimale in exces %.20e\n", nr2);

		System.out.print(nr1 * 2.9 + nr2 * 87.2);
		*/
	}

}
