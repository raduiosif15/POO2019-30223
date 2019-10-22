import java.util.*;
import java.math.*;

public class MainClass {
	
	public static void afisareMatrice(int nrLinii, int nrColoane, BigDecimal[][] M)
	{
		for (int i = 0; i < nrLinii; i++)
		{
			for (int j = 0; j < nrColoane; j++)
				System.out.print(M[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("Prima matrice");
		System.out.println("   Coordonatele matricii sunt:");
		System.out.print("   -n = "); 
		int n1 = tastatura.nextInt();
		System.out.print("   -m = ");
		int m1 = tastatura.nextInt();
		
		BigDecimal[][] M1 = new BigDecimal[n1][m1];
		
		for (int i = 0; i < n1; i++)
			for (int j = 0; j < m1; j++)
			{
				System.out.print("   M1[" + i + "][" + j + "] = ");
				M1[i][j] = tastatura.nextBigDecimal();
				System.out.println();
			}
		
		System.out.println();
		
		System.out.println("A doua matrice");
		System.out.println("   Coordonatele matricii sunt:");
		System.out.print("   -n2 = "); 
		int n2 = tastatura.nextInt();
		System.out.print("   -m2 = ");
		int m2 = tastatura.nextInt();
		
		BigDecimal[][] M2 = new BigDecimal[n2][m2];
		
		for (int i = 0; i < n2; i++)
			for (int j = 0; j < m2; j++)
			{
				System.out.print("   M1[" + i + "][" + j + "] = ");
				M2[i][j] = tastatura.nextBigDecimal();
				System.out.println();
			}
		
		if (n1 != n2 || m1 != m2)
			System.out.println("Nu se pot efectua operatii");
		else
		{
			afisareMatrice(n1, m1, M1);
			System.out.println();
			afisareMatrice(n1, m1, M2);
			
			BigDecimal[][] M3 = new BigDecimal[n2][m2];
			MatrixOperations f = new MatrixOperations();
			
			System.out.println("Matricile adunate sunt : ");
			M3 = f.add(M1, M2, n1, m1);
			afisareMatrice(n1, m1, M3);
			
			System.out.println("Matricile scazute sunt :");
			M3 = f.subtract(M1, M2, n1, m1);
			afisareMatrice(n1, m1, M3);
			
			System.out.println("Matricile inmultite sunt :");
			M3 = f.multiply(M1, M2, n1, m1);
			afisareMatrice(n1, m1, M3);
			
			BigDecimal doiBigDecimal = new BigDecimal(2);
			System.out.println("Matricea 1 inmultita cu scalarul 2 este :");
		//	M3 = f.multiplyScalar(M1, n1, m1, doiBigDecimal);
			afisareMatrice(n1, m1, M3);
			
			if (f.areEqual(M1, M2, n1, m1) == true)
				System.out.println("Matricile sunt egale.");
			else
				System.out.println("Matricile nu sunt egale.");
			
			if (f.isZeroMatrix(M1, n1, m1) == true)
				System.out.println("Matricea M1 este matricea nula.");
			else
				System.out.println("Matricea M1 nu este matricea nula.");
			
			if (f.isIdentityMatrix(M1, n1, m1) == true)
				System.out.println("Matricea M1 este matricea identitate.");
			else
				System.out.println("Matricea M1 nu este matricea identitate.");
			
			System.out.println("Raportul primei matrici este : " + f.fillDegree(M1, n1, m1));
			System.out.println("Raportul celei de-a doua matrice este : " + f.fillDegree(M2, n2, m2));
				
		}
		
	}

}
