import java.util.*;
import java.lang.String;

public class Ex3StringLetters {
	
	public static void vowelClue(String str,char ch) {
		System.out.println("You may found the charachter "+ch+" that you need in the following :");
		int n=str.length();
		for(int i=0; i<n; i++)
		{
			if(str.charAt(i) == ch)
				System.out.printf(i+" ");
		}
			
	}

	public static void numberOfVowelsConsonants(String str) {

		int contor = 0;
		int n = str.length();
		String vowels = "aeiou";
		int m = vowels.length();
		str = str.toLowerCase();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (vowels.charAt(j) == str.charAt(i)) {
					contor++;
				}
			}
		}
		System.out.println("Number of vowels is: " + contor);
		System.out.println("Number of consonant is: " + (n - contor));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		numberOfVowelsConsonants(str);
		char ch='a';
		vowelClue(str,ch);
	}
}
