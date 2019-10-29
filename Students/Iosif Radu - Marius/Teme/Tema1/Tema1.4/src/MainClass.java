
public class MainClass {

	public static void main(String[] args)
	{
		int[][] a = new int[10][10];
		
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
				a[i][j] = 0;
		}
		
		int maxNr = 81;
		int limLeft = 0;
		int limUp = 0;
		int limRight = 8;
		int limDown = 8;
		
		while (maxNr > 0)
		{
			for (int i = limDown; i >= limLeft; i--)
				{
					a[limDown][i] = maxNr;
					maxNr--;
				}
			isPrim(++maxNr);
			maxNr--;
			limDown--;
			
			for (int i = limDown; i >= limUp; i--)
			{
				a[i][limLeft] = maxNr;
				maxNr--;
			}
			
			limLeft++;
			
			for (int i = limLeft; i <= limRight; i++)
			{
				a[limUp][i] = maxNr;
				maxNr--;
			}
			
			limUp++;
			
			for (int i = limUp; i <= limDown; i++)
			{
				a[i][limRight] = maxNr;
				maxNr--;
			}
			
			limRight--;
			
		}
		
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				if (a[i][j] < 10)
					System.out.print(" ");
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
