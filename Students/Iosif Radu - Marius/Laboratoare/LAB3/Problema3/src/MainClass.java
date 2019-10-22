import java.util.Scanner;

/*
 * Programul nu functioneaza si nu mi-am dat seama de ce :(
 */

public class MainClass
{
	public static int strLen(String sir)
	{
		int nrElemente = 0;
		char elementCurent = sir.charAt(nrElemente);
		while (elementCurent != 0)
		{
			nrElemente++;
			elementCurent = sir.charAt(nrElemente);
		}
		
		return nrElemente;
	}
	
	public static int strChr(String text, Character litera)
	{
		int nrElemente = strLen(text);
		
		for  (int i = 0; i < nrElemente; i++)
		{
			if (litera.equals(text.charAt(i)))
				return 1;
		}
		
		return 0;
		
	}

	public static void main(String[] args)
	{
		Scanner tastatura = new Scanner(System.in);
		System.out.print("Textul este: ");
		String text = tastatura.nextLine();
		String vocale = "aeiou";
	
		int nrVocale = 0;
		int nrConsoane = 0;
		
		int nrDeElemente = strLen(text);
		
		for (int index = 0; index < nrDeElemente; index++)
		{
			int valoareStrChr = strChr(vocale, text.charAt(index));
			
			if (valoareStrChr == 1)
				nrVocale++;
			else
				nrConsoane++;
		}
		
		System.out.println("Numarul de vocale este " + nrVocale + " iar numarul de consoane este " + nrConsoane + ".");

	}

}
