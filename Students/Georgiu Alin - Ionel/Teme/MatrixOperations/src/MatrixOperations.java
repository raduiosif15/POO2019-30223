import java.math.*;
import java.util.*;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigDecimal;

public class MatrixOperations {

	public static BigDecimal[][] addMatrix(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		// presunpun ca matricele au aceasi dimnesiune
		int row1, row2, col1, col2;
		row1 = matrix1.length;
		row2 = matrix2.length;
		col1 = matrix1[0].length;
		col2 = matrix2[0].length;
		BigDecimal[][] sumMatrix = new BigDecimal[row1][col2];
		// verificam daca se poate face operatia
		if (row1 != row2)
			return null;
		if (col1 != col2)
			return null;
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				sumMatrix[i][j] = matrix1[i][j].add(matrix2[i][j]);
			}
		}
		return sumMatrix;
	}

	public static BigDecimal[][] subtractMatrix(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		// presunpun ca matricele au aceasi dimnesiune
		int row1, row2, col1, col2;
		row1 = matrix1.length;
		row2 = matrix2.length;
		col1 = matrix1[0].length;
		col2 = matrix2[0].length;
		BigDecimal[][] substractMatrix = new BigDecimal[row1][col2];
		// verificam daca se poate face operatia
		if (row1 != row2)
			return null;
		if (col1 != col2)
			return null;
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				sumMatrix[i][j] = matrix1[i][j].substract(matrix2[i][j]);
			}
		}
		return substractMatrix;
	}

	public static BigDecimal[] multiplyMatrixByScalar(BigDecimal[] matrix,BigDecimal scalar) {
		int row=matrix.length;
		int col=matrix[0].length;
		Big Decimal[] scalMatrix=new BigDecimal[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				scalMatrix[i][j]=scalMatrix[i][j].multiply(scalar);
			}
		}
		return scalMatrix;
	}

	public static BigDecimal[][] multiplyMatrix(BigDecimal[] matrix1, BigDecimal matrix2) {
		int row1, row2, col1, col2;
		row1 = matrix1.length;
		row2 = matrix2.length;
		col1 = matrix1[0].length;
		col2 = matrix2[0].length;
		BigDecimal[][] mulMatrix = new BigDecimal[row1][col2];
		if (row1 != row2)
			return -1;
		if (col1 != col2)
			return -1;

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				for (int t = 0; t < col1; t++) {
					mulMatrix[i][j] = mulMatrix[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
				}

			}
		}
		return mulMatrix;
	}

	public static BigDecimal det(BigDecimal[][] matrix) {
		int col = matrix[0].length;
		int detSign = 1;

		BigDecimal resultD = BigDecimal.valueOf(0);
		if (col == 1)
			return matrix[0][0];
		if (matrix.length != col)
			return -1;
		if (col == 2) {
			BigDecimal x = new BigDecimal(1);
			BigDecimal y = new BigDecimal(1);
			resultD = x.multiply(a[1][1]);
			resultD = x.multiply(a[0][0]);
			resultD = y.multiply(a[1][0]);
			resultD = y.multiply(a[0][1]);
			resultD = x.subtract(rez2);
		}
		return resultD;
	}

	public static int equalMatrix(BigDecimal[] matrix1, BigDecimal[] matrix2) {
		int row1, row2, col1, col2;
		row1 = matrix1.length;
		row2 = matrix2.length;
		col1 = matrix1[0].length;
		col2 = matrix2[0].length;
		if (row1 != row2 || col1 != col2)
			return -1;
		for (int i = 0; i < row2; i++)
			for (j = 0; j < col2; j++)
				if (matrix1[i][j] != matrix2[i][j])
					return -1;
		return 1;
	}

	public static int isIdenitityMatrix(BigDecimal[] matrix) {
		int row = matrix.length;
		for (int i = 0; i < row; i++)
			if (matrix[i][i].compareTo(1))
				return -1;
		return 1;
	}

	public static int matrixIsZero(BigDecimal[] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (matrix[i][j].compareTo(0))
					return -1;
		return 1;
	}

	static void getCofactor(BigDecimal mat[][], int BigDecimal[][], int p, int q, int n) {
		int i = 0, j = 0;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row != p && col != q) {
					temp[i][j++] = mat[row][col];

					if (j == n - 1) {
						j = 0;
						i++;
					}
				}
			}
		}
	}

	static int determinantOfMatrix(BigDecimal mat[][], int n) {
		int D = 0;

		if (n == 1)
			return mat[0][0];

		BigDecimal temp[][] = new BigDecimal[n][n];

		int sign = 1;

		for (int f = 0; f < n; f++) {
			getCofactor(mat, temp, 0, f, n);
			D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);

			sign = -sign;
		}

		return D;
	}

	public static void main(String[] args) {
		BigDecimal matrix1[][] = { { new BigDecimal(1), new BigDecimal(-1), new BigDecimal(5) },
				{ new BigDecimal(2), new BigDecimal(-2), new BigDecimal(6) },
				{ new BigDecimal(3), new BigDecimal(-3), new BigDecimal(7) } };

		BigDecimal matrix2[][] = { { new BigDecimal(3), new BigDecimal(1), new BigDecimal(-1) },
				{ new BigDecimal(2), new BigDecimal(7), new BigDecimal(-2) },
				{ new BigDecimal(9), new BigDecimal(3), new BigDecimal(9) } };
		int n=3;
		BigDecimal matrix[][];
		matrix=addMatrix(matrix1,matrix2);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}