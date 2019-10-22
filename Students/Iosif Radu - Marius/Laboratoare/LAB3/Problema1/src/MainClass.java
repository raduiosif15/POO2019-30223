import java.util.*;

public class MainClass {
	
	public static boolean prim(int numar)
	{
		for (int i = 2; i < numar; i++)
			if (numar % i == 0)
				return false;
		
		return true;
	}

	public static void main(String[] args) {
		Scanner tastatura = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = tastatura.nextInt();
		
		System.out.println();
		System.out.print("m = ");
		int m = tastatura.nextInt();
		
		if (n % 2 == 1)
			n++;
		int contor = 0;
		for (int i = n; i <= m; i += 2)
		{
			for (int j = 2; j < i / 2 + 1; j++)
			{
				int primulNumar = j;
				if (prim(primulNumar) == true)
				{
					int alDoileaNumar = i - j;
					
					if (prim(alDoileaNumar) == true)
					{
						contor++;
						System.out.println(i + " = " + primulNumar + " + " + alDoileaNumar);
					}
				}
			}
		}
		
		if (contor == 0)
			System.out.println("Relatia nu este adevarata.");
		else
			System.out.println("Relatia este adevarata.");
	}

}
