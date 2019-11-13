package hotel;

public class Camera {

	int nrCamerei = 1;
	int capacitate = 2;
	int pretPeNoapte = 50;
	boolean regimSingle = false;
	int discount = 10;
	int persoaneDejaCazate = 0;
	
	public Camera() {
		
	}
	
	public Camera(int nrCamerei, int capacitate, int pretPeNoapte, int discount) {
		this.nrCamerei = nrCamerei;
		this.capacitate = capacitate;
		this.pretPeNoapte = pretPeNoapte;
		this.discount = discount;
	}
	
	public int getNrCamerei() {
		return this.nrCamerei;
	}
	
	public int getCapacitate() {
		return this.capacitate;
	}
	
	public int getPretPeNoapte() {
		return this.pretPeNoapte;
	}
	
	public int calcularePret(int nrDeNopti, boolean regimSingle) {
		int sumaTotala = 0;
		int pretulCuCareCalculam = this.pretPeNoapte;
		int zileNecesarePentruDiscount = 5;
		if (regimSingle == true) {
			pretulCuCareCalculam = this.pretPeNoapte * this.capacitate;
			zileNecesarePentruDiscount = 3;
		}
		
		for (int i = 0; i < nrDeNopti; i++) {
			sumaTotala += pretulCuCareCalculam;
		}
		
		if (nrDeNopti > zileNecesarePentruDiscount) {
			sumaTotala = sumaTotala * (100 - this.discount) / 100;
			// intentionat am lasat suma int; asta este ideea mea de a aplica reducerea ( cu suma rotunjita)
		}
		
		return sumaTotala;
	}
	
	public boolean getStatusCamera() {
		if (this.capacitate == this.persoaneDejaCazate)
			return false;
		
		return true;
	}
	
	public int getNrDeLocuriDisponibile() {
		return this.capacitate - this.persoaneDejaCazate;
	}
}
