
public class Dog {
	static int dogCount = 0;

	public Dog() {
		dogCount += 1;
	}

	public static void main(String[] args) {
		new Dog();
		new Dog();
		new Dog();
		System.out.println("Frog count is now " + dogCount);
	}
	// daca se sterge "static" de la dogCount programul nu va rula
	// deoarece variabila nu e de acelasi tip cu functia main

}
