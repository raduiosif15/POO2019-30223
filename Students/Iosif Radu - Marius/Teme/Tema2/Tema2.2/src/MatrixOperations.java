import java.util.*;
import java.math.*;

public class MatrixOperations {
	
	public static BigDecimal[][] add(BigDecimal[][] M1, BigDecimal[][] M2, int nrLinii, int nrColoane)
	{
		
		BigDecimal[][] M3 = new BigDecimal[nrLinii][nrColoane];
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				M3[i][j] = M1[i][j].add(M2[i][j]);
			}
		
		return M3;
	}
	
	public static BigDecimal[][] subtract(BigDecimal[][] M1, BigDecimal[][] M2, int nrLinii, int nrColoane)
	{
		
		BigDecimal[][] M3 = new BigDecimal[nrLinii][nrColoane];
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				M3[i][j] = M1[i][j].subtract(M2[i][j]);
			}
		
		return M3;
	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] M1, BigDecimal[][] M2, int nrLinii, int nrColoane)
	{
		
		BigDecimal[][] M3 = new BigDecimal[nrLinii][nrColoane];
		
		for (int i = 0; i < nrLinii; i++)
		{
			for (int j = 0; j < nrColoane; j++)
			{
				BigDecimal suma = new BigDecimal(0);
				
				for (int z = 0; z < nrColoane; z++)
				{
					suma = suma.add(M1[i][z].multiply(M2[z][j]));
				}
				
				M3[i][j] = suma;
			}
		}
		
		return M3;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] M1, int nrLinii, int nrColoane, BigDecimal scalar)
	{
		
		BigDecimal[][] M3 = new BigDecimal[nrLinii][nrColoane];
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				M3[i][j] = M3[i][j].multiply(scalar);
			}
		
		return M3;
	}
	
	public static boolean areEqual(BigDecimal[][] M1, BigDecimal[][] M2, int nrLinii, int nrColoane)
	{
		for (int i = 0; i < nrLinii; i++)
		{
			for (int j = 0; j < nrColoane; j++)
			{
				if (M1[i][j].equals(M2[i][j]) == false)
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] M1, int nrLinii, int nrColoane)
	{
		BigDecimal zero = new BigDecimal(0);
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				if (M1[i][j].equals(zero) == false)
					return false;
			}
		
		return true;
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] M1, int nrLinii, int nrColoane)
	{
		BigDecimal zero = new BigDecimal(0);
		BigDecimal unu = new BigDecimal(1);
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				if (i == j)
				{
					if (M1[i][j].equals(unu) == false)
						return false;
				}
				else if (M1[i][j].equals(zero) == false)
					return false;
			}
		
		return true;
	}
	
	public static BigDecimal fillDegree(BigDecimal[][] M1, int nrLinii, int nrColoane)
	{
		BigDecimal raport = new BigDecimal(0);
		BigDecimal zero = new BigDecimal(0);
		BigDecimal unu = new BigDecimal(1);
		
		for (int i = 0; i < nrLinii; i++)
			for (int j = 0; j < nrColoane; j++)
			{
				if (M1[i][j].equals(zero) == false)
					raport.add(unu);
			}
		
		BigDecimal impartitor = new BigDecimal(nrLinii * nrColoane);
		
		raport.divide(impartitor);
	
		return raport;
	}
	
	
}
