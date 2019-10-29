import java.util.Scanner;

public class MainClass {
	
	public static boolean estePrim(int numar)
	{
		if (numar < 2)
			return false;
		
		for (int i = 2; i < numar; i++)
		{
			if (numar % i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner tastatura = new Scanner(System.in);
		
		System.out.print("m = ");
		int m = tastatura.nextInt();
		
		System.out.println();
		
		System.out.print("n = ");
		int n = tastatura.nextInt();
		
		//System.out.println(n + " " + m);
		
		if (m % 2 == 1)
			m++;
		
		int ok1 = 1;
		
		for (int i = m; i <= n; i += 2)
		{
			int ok = 0;
			int primulNumar = 2;
			while (ok == 0 && primulNumar < i)
			{
				if (estePrim(primulNumar) == true)
				{
					int alDoileaNumar = i - primulNumar;
					if (estePrim(alDoileaNumar) == true)
					{
						System.out.println(i + " = " + primulNumar + " + " + alDoileaNumar);
						ok = 1;
					}
				}
				primulNumar++;
			}
			ok1 *= ok;
		}
		
		if (ok1 == 1)
			System.out.println("E ok");
		else
			System.out.println("Nu e ok");
		
	}

}
