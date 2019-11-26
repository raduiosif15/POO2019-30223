import java.lang.reflect.Array;
import java.net.SocketOption;

public class TestPersoana {
    public static void main(String[] args) {
        Persoana[] persoane = new Persoana[3];

        persoane[0].setNume("Iosif");
        persoane[1].setNume("Crecan");
        persoane[2].setNume("State");

        persoane[0].setPrenume("Radu");
        persoane[1].setPrenume("Dragos");
        persoane[2].setPrenume("Marin");

        persoane[0].setVarsta(19);
        persoane[1].setVarsta(20);
        persoane[2].setVarsta(21);

        
    }
}
