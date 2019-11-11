public class Caiete extends Rechizite {
    public Caiete(String materie) {
        this.eticheta = materie;
    }

    @Override
    public String getName(){
        return "Caiet " + eticheta;
    }
}
