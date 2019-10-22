import java.io.*;
import java.util.*;

public class MainClass {
	
	public static void afisarePolinom(Polinom p, FileWriter scriere) throws IOException
	{
		int n = p.grad;
		scriere.write(String.valueOf(p.coeficienti[0]) + " * x ^ " + String.valueOf(n));
		for (int i = 1; i < n - 1; i++)
		{
			int puterea = n - i;
			int coeficient = p.coeficienti[i];
			if (coeficient < 0)
				scriere.write(" " + String.valueOf(coeficient) + " * x ^ " + String.valueOf(puterea));
			else if (coeficient > 0)
				scriere.write(" + " + String.valueOf(coeficient) + " * x ^ " + String.valueOf(puterea));
		}

		if (p.coeficienti[n - 1] < 0)
			scriere.write(String.valueOf(p.coeficienti[n - 1]) + " * x");
		else if (p.coeficienti[n - 1] > 0)
			scriere.write(" + " + String.valueOf(p.coeficienti[n - 1]) + " * x");
		if (p.coeficienti[n] < 0)
			scriere.write(" " + String.valueOf(p.coeficienti[n]));
		else if (p.coeficienti[n] > 0)
			scriere.write(" + " + String.valueOf(p.coeficienti[n]));
		
		scriere.write("\n");
	}
	
	public static void main(String[] args) throws IOException {
		File f = new File("dateIntrare.txt");
		Writer scriereInFisier = new FileWriter("dateIesire.txt");
		
		try (Scanner r = new Scanner(f))
		{
			int n = r.nextInt();
			int m = r.nextInt();
			
			Polinom p1 = new Polinom(n);
			Polinom p2 = new Polinom(m);
			
			for (int i = n; i >= 0; i--)
			{
				int aux = r.nextInt();
				p1.coeficienti[i] = aux;
			}
			
			for (int i = m; i >= 0; i--)
			{
				int aux = r.nextInt();
				p2.coeficienti[i] = aux;
			}
			
			Functii functie = new Functii();
			
			functie.afisarePolinom2(p1);
			functie.afisarePolinom2(p2);
			
			int nrOperatii = r.nextInt();
			
			for (int i = 0; i < nrOperatii; i++)
			{
				String operatie;
				operatie = r.next();
				
				if (operatie.equals("ADD"))
				{
					Polinom p3 = functie.adunarePolinom(p1, p2);
					functie.afisarePolinom2(p3);
				}
				if (operatie.equals("SUBTRACT"))
				{
					Polinom p3 = functie.scaderePolinom(p1, p2);
					functie.afisarePolinom2(p3);
				}
				if (operatie.equals("MULTIPLY"))
				{
					Polinom p3 = functie.inmultirePolinom(p1, p2);
					functie.afisarePolinom2(p3);
				}
				if (operatie.equals("MUL_SCAL"))
				{
					int nrDeInmultit = r.nextInt();
					Polinom p3 = functie.inmultireCuUnScalar(p1, nrDeInmultit);
					Polinom p4 = functie.inmultireCuUnScalar(p2, nrDeInmultit);
					functie.afisarePolinom2(p3);
					functie.afisarePolinom2(p4);
				}
				if (operatie.equals("EVAL"))
				{
					int nrDeEvaluat = r.nextInt();
					int polinom1evaluat = functie.evaluarePolinom(p1, nrDeEvaluat);
					int polinom2evaluat = functie.evaluarePolinom(p2, nrDeEvaluat);
					
					System.out.println(polinom1evaluat);
					System.out.println(polinom2evaluat);
				}
			}
			
		} 
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		
	}

}
