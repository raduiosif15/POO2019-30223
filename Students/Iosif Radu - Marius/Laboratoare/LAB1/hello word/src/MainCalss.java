import java.util.Random;

public class MainCalss {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MaxValue = 10;
		Random rand = new Random();
		double doubleRandom = Math.random() * 10;
		int intRandom = (int) (Math.random() * 100);
		System.out.println(2 * doubleRandom);
		System.out.println(2 * intRandom);
	}
}
