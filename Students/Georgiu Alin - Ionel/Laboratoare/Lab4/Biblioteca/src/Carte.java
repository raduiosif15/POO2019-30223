
public class Carte {
	private String nume;
	private String autor;
	private int nrMatricol;
	public Carte(String nume,String autor,int nrMatricol) {
		this.nume=nume;
		this.autor=autor;
		this.nrMatricol=nrMatricol;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNrMatricol() {
		return nrMatricol;
	}
	public void setNrMatricol(int nrMatricol) {
		this.nrMatricol = nrMatricol;
	}
}
