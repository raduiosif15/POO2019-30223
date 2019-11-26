import java.lang.reflect.Array;
import java.net.SocketOption;
import java.util.Arrays;

public class TestPersoana {
    public static void main(String[] args) {
        Persoana[] persoane = new Persoana[4];

        Persoana persoana0 = new Persoana("Iosif", "Radu");
        Persoana persoana1 = new Persoana("Crecan", "Dragos");
        Persoana persoana3 = new Persoana("Crecan", "Aragos");
        Persoana persoana2 = new Persoana("State", "Marin");

        persoane[0] = persoana0;
        persoane[1] = persoana1;
        persoane[2] = persoana2;
        persoane[3] = persoana3;

        persoane[0].setVarsta(19);
        persoane[1].setVarsta(20);
        persoane[2].setVarsta(21);

        Arrays.sort(persoane);

        for (int i = 0; i < persoane.length; i++) {
            System.out.println(persoane[i].toString());
        }
    }
}
