import java.util.Random;
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello world.");
		int n = 10;
		Random rand = new Random();
		int i= rand.nextInt(n);
		int i2= i*2;
		System.out.println(i2);
	}

}
