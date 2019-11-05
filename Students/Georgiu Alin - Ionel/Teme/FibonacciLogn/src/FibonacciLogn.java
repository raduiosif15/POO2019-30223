/*
If n is even then k = n/2:
F(n) = [2*F(k-1) + F(k)]*F(k)

If n is odd then k = (n + 1)/2
F(n) = F(k)*F(k) + F(k-1)*F(k-1)
 */



import java.util.Scanner;
import java.util*;

public class FibonacciLogn {

	public static int fibonacciFunction(int n,int f[1000]) {

		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {

			if (f[n] == 1)
				return 1;
			else
				return 0;
		}
		if (f[n] != 0) {
			return f[n];
		}
		int k;
		if (n % 2 == 0) {
			k = n / 2;
			f[n] = (2 * fibonacciFunction(k - 1,f) + fibonacciFunction(k,f) * fibonacciFunction(k,f);
		} 
		else {
			k = (n + 1) / 2;
			f[n] = fibonacciFunction(k,f) * fibonacciFunction(k,f) + fibonacciFunction(k - 1,f) * fibonacciFunction(k - 1,f);
		}
		return f[n];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n=in.nextInt();
		int f[];
		f=new int[1000];
		int sumEvenTermFibo=0;
		for(int i=1;i<=n;i++) {
			float aux;
			//aux=fibonacciFunction(i,f); // ???????????????????????
			if(fibonacciFunction(i,f)%2 ==0 )
					sumEvenTermFibo+=fibonacciFunction(i,f);
		}
		System.out.println(sumEvenTermFibo);
	}
}
