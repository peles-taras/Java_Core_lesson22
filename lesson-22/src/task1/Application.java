package task1;

public class Application {
	public static void main(String[] args) {

		functionalInterface cat = () -> System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		cat.voice();
		functionalInterface dog = () -> System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		dog.voice();
		functionalInterface cow = () -> System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
		cow.voice();

	}
}