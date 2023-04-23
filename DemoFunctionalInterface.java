package corejava;

@FunctionalInterface()
interface DemoFunctional {

	void print();

}

public class DemoFunctionalInterface implements DemoFunctional {
	public static void main(String[] args) {
		DemoFunctionalInterface d = new DemoFunctionalInterface();
		d.print();
	}

	@Override
	public void print() {
		System.out.println("Hello!!!");
	}

}
