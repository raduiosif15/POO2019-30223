import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner tastatura = new Scanner(System.in);
		System.out.println("String-ul este: ");
		String text = tastatura.nextLine();
		System.out.println(inversare(text));
	}
	
	public static String inversare(String string) {
		if (string.contains(" ") == true) {
			string = string.trim();
		}
		
		String[] cuvinte = string.split(" ");
		
		if (cuvinte.length == 1)
		{
			return cuvinte[0];
		}
		if (cuvinte.length == 2)
		{
			string = cuvinte[1].concat(", ");
			string = string.concat(cuvinte[0]);
			return string;
		}
		
		int nrCuvinte = cuvinte.length;
		
		string = cuvinte[nrCuvinte - 1].concat(", ");
		string = string.concat(cuvinte[nrCuvinte - 2]);
		
		for (int i = 0; i < nrCuvinte - 2; i++)
			{
			string = string.concat(" ");
			string = string.concat(cuvinte[i]);
			}
		
		return string;
	}

}
