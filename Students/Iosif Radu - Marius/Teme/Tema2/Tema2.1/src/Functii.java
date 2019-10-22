import java.io.FileWriter;
import java.io.IOException;

public class Functii {
	
	public static void afisarePolinom2(Polinom p)
	{
		int n = p.grad;
		System.out.print(p.coeficienti[n] + " * x ^ " + n);
		for (int i = n - 1; i > 1; i--)
		{
			int puterea = i;
			int coeficient = p.coeficienti[i];
			if (coeficient < 0)
				System.out.print(" " + coeficient + " * x ^ " + puterea);
			else if (coeficient > 0)
				System.out.print(" + " + coeficient + " * x ^ " + puterea);
		}

		if (p.coeficienti[1] < 0)
			System.out.print(p.coeficienti[1] + " * x");
		else if (p.coeficienti[1] > 0)
			System.out.print(" + " + p.coeficienti[1] + " * x");
		if (p.coeficienti[0] < 0)
			System.out.print(" " + p.coeficienti[0]);
		else if (p.coeficienti[0] > 0)
			System.out.print(" + " + p.coeficienti[0]);
		
		System.out.println();
	}
	
	public static Polinom adunarePolinom(Polinom p1, Polinom p2)
	{
		int maxGrad = p1.grad;
		if (p2.grad > p1.grad)
			maxGrad = p2.grad;
		Polinom p3 = new Polinom(maxGrad);
		
		for (int i = 0; i <= maxGrad; i++)
		{
			int c1 = 0;
			int c2 = 0;
			
			if (i <= p1.grad)
				c1 = p1.coeficienti[i];
			
			if (i <= p2.grad)
				c2 = p2.coeficienti[i];
			
			p3.coeficienti[i] = c1 + c2;
		}

		return p3;
	}
	
	public static Polinom scaderePolinom(Polinom p1, Polinom p2)
	{
		int maxGrad = p1.grad;
		if (p2.grad > p1.grad)
			maxGrad = p2.grad;
		Polinom p3 = new Polinom(maxGrad);
		
		for (int i = 0; i <= maxGrad; i++)
		{
			int c1 = 0;
			int c2 = 0;
			
			if (i <= p1.grad)
				c1 = p1.coeficienti[i];
			
			if (i <= p2.grad)
				c2 = p2.coeficienti[i];
			
			p3.coeficienti[i] = c1 - c2;
		}

		return p3;
	}
	
	public static Polinom inmultirePolinom(Polinom p1, Polinom p2)
	{
		int maxGrad = p1.grad + p2.grad;
		Polinom p3 = new Polinom (maxGrad);
		
		for (int i = 0; i <= maxGrad; i++)
		{
			p3.coeficienti[i] = 0;
		}
		
		for (int i = 0; i <= p1.grad; i++)
		{
			for (int j = 0; j <= p2.grad; j++)
			{
				p3.coeficienti[i + j] += p1.coeficienti[i] * p2.coeficienti[j];
			}
		}
		
		return p3;
	}
	
	public static Polinom inmultireCuUnScalar(Polinom p, int numar)
	{
		int m = p.grad;
		
		for (int i = 0; i <= m; i++)
			p.coeficienti[i] *= numar;
		
		return p;
	}
	
	public static int evaluarePolinom(Polinom p, int numar)
	{
		int m = p.grad;
		int suma = 0;
		int baza = 1;
		
		for (int i = 0; i <= m; i++)
		{
			suma += baza * p.coeficienti[i];
			baza *= numar;
		}
		
		return suma;
	}
	
}
