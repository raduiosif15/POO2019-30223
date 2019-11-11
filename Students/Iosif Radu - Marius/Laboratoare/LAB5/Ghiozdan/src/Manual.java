public class Manual extends Rechizite {
    public Manual(String materie) {
        this.eticheta = materie;
    }

    @Override
    public String getName(){
        return "Manual " + eticheta;
    }
}
