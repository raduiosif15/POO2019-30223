//4.5 Error 405: Imagination not found :))
public class Accident {
	public int nrAccident;
	public double alcoolemieSofer1;
	public double alcoolemieSofer2;

	public Accident(int nrAccident, double alcS1, double alcS2) {
		this.nrAccident = nrAccident;
		this.alcoolemieSofer1 = alcS1;
		this.alcoolemieSofer2 = alcS2;
	}

	public int vinovat() {
		if (this.alcoolemieSofer1 > 0.01)
			return 1;
		return 2;
	}
}
