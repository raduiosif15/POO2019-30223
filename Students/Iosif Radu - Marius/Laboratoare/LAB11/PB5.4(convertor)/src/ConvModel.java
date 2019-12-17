public class ConvModel {

    private String suma;

    public String convertor(String suma, Double cursValutar){
        Double sumaDouble = Double.parseDouble(suma);
        sumaDouble *= cursValutar;

        return sumaDouble.toString();
    }
}
