package task1;

public class Application {
	public static void main(String[] args) {

		functionalInterface cat = () -> System.out.println("� ��- �����-�����");
		cat.voice();
		functionalInterface dog = () -> System.out.println("� ��� - �����-�����");
		dog.voice();
		functionalInterface cow = () -> System.out.println("� ������- ����-����");
		cow.voice();

	}
}