package task2;

public class Frog {

	Amphibia eat = () -> System.out.println("Frog is eating");
	Amphibia sleep = () -> System.out.println("Frog is sleeping");
	Amphibia swim = () -> System.out.println("Frog is swimming");
	Amphibia walk = () -> System.out.println("Frog is walking");

	public static void main(String[] args) {
		Frog f = new Frog();
		f.eat.action();
		f.sleep.action();
		f.swim.action();
		f.walk.action();
	}
}
