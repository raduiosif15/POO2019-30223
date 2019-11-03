import java.util.Scanner;

public class SumaMultiplii {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n = 9000;
		//n=in.nextDouble();
		double sumaMultiplii = 0;
		for(double i = 1; i < n; i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				sumaMultiplii+=i;
			}
		}
		System.out.print(sumaMultiplii);
	}

}
/* Pentru o variabila intreaga va aparea Overflow in cazul in care sumaMultiplii va depasi valoarea 2147483647

asadar incepand cu valoarea ????? nu mai afiseaza corect,
iar pentru double...
*/