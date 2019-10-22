import java.util.*;

public class ExLoterie {

	public static void winningProbability() {
		/*
		 * the algorithm for this is a couple of math calculations like: (combinari de n
		 * luate cate k) where n = total number of balls in the set, k = total number of
		 * balls in the winning combination for the jackpot prize
		 */
		int n = 49;
		int k = 6;
		double x = 1.0;
		for (int i = k; i > 0; i--)// combinarile de 49 luate cate 6 ...n! = n * (n - 1) * (n - 2) * ... * 3 * 2 *
									// 1.
		{
			x = x * (n / i);
			n--;
		}
		double rez = 1.0 / x;
		System.out.println(rez);

	}

	public static boolean winningTheLottery() {
		int[] wining_numbers = new int[] { 10, 12, 14, 16, 19, 7 };
		int[] alins_numbers = new int[7];
	
		for (int i = 1; i <= 6; i++) {
			int random_number = (int) (Math.random() * 50 + 1);
			alins_numbers[i] = random_number;
		}
		int correct_numbers = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j <= 5; j++) {
				if (wining_numbers[j] == alins_numbers[i]) {
					correct_numbers++;
				}
			}
		}
		if (correct_numbers == 6)
			return true;
		return false;

	}

	public static void main(String[] args) {
		// winningProbability();
		int number_of_tries=0;
		while(winningTheLottery()==false) {
			number_of_tries++;
		}
		System.out.println(number_of_tries);
	}
	
}
