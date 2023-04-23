package corejava;

abstract class DemoAbs {
	abstract void print();

	void printnext() {
		System.out.println("Complete Method");
	}

}

public class DemoAbstract extends DemoAbs {
	public static void main(String[] args) {
		DemoAbstract d = new DemoAbstract();
		d.print();
		d.printnext();
	}

	@Override
	void print() {
		System.out.println("Hello");

	}

}
