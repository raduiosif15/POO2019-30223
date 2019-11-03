import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,a,b,c;
		n=in.nextInt();
		a=1;
		b=1;
		float sumEvenTermFibo = 0;
		
		if(n == 1) {
			sumEvenTermFibo = n;
		}
		else {
			
			for(int i=3; i<=n;i++) {
				c=a+b;
				if(c%2 != 0)
				{
					sumEvenTermFibo += c;
				}
				a = b;
				b = c;
			}
		}
		System.out.println(sumEvenTermFibo);
	}
}
