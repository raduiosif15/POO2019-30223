public class Masina {
    public String marca;
    public String culoare;

    public Masina(String marca, String culoare){
        this.marca = marca;
        this.culoare = culoare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }
}
