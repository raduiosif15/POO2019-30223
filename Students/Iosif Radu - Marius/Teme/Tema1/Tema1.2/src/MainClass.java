
public class MainClass {

	public static void main(String[] args) {
		int fibo1 = 1;
		int fibo2 = 2;
		int fibo3 = 3;

		int sumOfFibo = 2;

		while (fibo3 < 4000000) {
			if (fibo3 % 2 == 0)
				sumOfFibo += fibo3;
			fibo1 = fibo2;
			fibo2 = fibo3;
			fibo3 = fibo1 + fibo2;
		}

		System.out.println("Suma termenilor pari este : " + sumOfFibo);

	}

}
