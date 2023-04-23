package corejava;

@FunctionalInterface
interface DemoLamdas {
	void print();
}

public class DemoLamdasExpression {
	public static void main(String[] args) {
		DemoLamdas d = () -> {
			System.out.println("Lamdas Expression !!!");
		};
		d.print();
	}

}
