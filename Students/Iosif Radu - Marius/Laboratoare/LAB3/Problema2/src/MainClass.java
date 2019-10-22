import java.util.Scanner;

public class MainClass {

	public static double functia(double x, int a, int b, int c)
	{
		return a * x * x + b * x + c;
	}
	
	public static double derivata(double x, int a, int b)
	{
		return 2 * a * x + b;
	}
	
	public static double fAbs(double a)
	{
		if (a < 0)
			a *= -1;
		
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner tastatura = new Scanner(System.in);
		
		System.out.print("a = "); int a = tastatura.nextInt();
		System.out.print("b = "); int b = tastatura.nextInt();
		System.out.print("c = "); int c = tastatura.nextInt();
	
		if (b * b - 4 * a * c < 0)
			System.out.println("Delta negativ => nu exista radacini reale.");
		else
		{
		
		double x0 = 1.0;
		double x1 = 1.0;
		
		int contorIteratii = 0;
		
		do
		{
			x0 = x1;
			x1 = x0 - functia(x0, a, b, c) / derivata(x0, a, b);
			contorIteratii++;
		}while (fAbs(x0 - x1) > 0.00001f);
		
		System.out.println("O radacina a ecatiei este " + x1 + " iar numarul de iteratii este " + contorIteratii + ".");
		}
	}

}
