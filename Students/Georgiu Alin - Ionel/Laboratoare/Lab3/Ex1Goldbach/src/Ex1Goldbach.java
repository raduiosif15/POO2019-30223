import java.util.Scanner;

public class Ex1Goldbach {

	static boolean primeNumber(int n) {
		int prim = 1; // presupunem ca e prim la inceput

		if (n < 2)
			prim = 0;
		if (n % 2 == 0 && n > 2)
			prim = 0;
		for (int d = 3; d * d <= n && prim == 1; d++)
			if (n % d == 0)
				prim = 0;
		if (prim == 0)
			return false;
		return true;

	}

	static void goldbach(int n) {

		if (n < 2) {
			System.out.println("numarul introdus e mai mic decat 2");
			return;
		}

		if (n % 2 != 0) {
			System.out.printf("numarul introdus e par");
			return;
		}

		for (int i = 2; i <= n / 2 + 1; i++) {
			if (primeNumber(i) && primeNumber(n - i)) {
				System.out.println(i + "+" + (n - i));
			}
				
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		System.out.printf("n= ");
		n = in.nextInt();
		System.out.printf("m= ");
		m = in.nextInt();
		for (int i = n; i <= m; i++) {
			System.out.println(i + " se poate scrie ca suma: ");
			goldbach(i);
			System.out.println();
		}
	}
}