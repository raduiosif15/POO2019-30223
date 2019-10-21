import java.text.DecimalFormat;
import java.util.Scanner; 
public class Ex2NewtonMethod {

	static double f(int a, int b, int c, double x) {
		return a * x * x + b * x + c;
	}

	static double fd(int a, int b, double x) {
		return 2 * x * a + b;
	}

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		int a, b, c;
		double x;
		int contor = 0;
		double epsilon = 0.000001;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti a= ");
		a = in.nextInt();
		System.out.println("Introduceti b= ");
		b = in.nextInt();
		System.out.println("Introduceti c= ");
		c = in.nextInt();
		System.out.println("Introduceti x= ");
		x = in.nextDouble();
		
		double aux = f(a, b, c, x);
		while (Math.abs(aux) > epsilon) {
			x = x - f(a, b, c, x) / fd(a, b, x);
			contor++;
			aux = f(a, b, c, x);
		}
		aux = f(a, b, c, x);
		if (Math.abs(aux) <= epsilon) {
			System.out.println(
					"Radacina gasita este " + df2.format(x) + " si a fost gasita dupa un numar de " + contor + " pasi");
		} else
			System.out.println("Nu s-au gasit radacini");
	}
}
