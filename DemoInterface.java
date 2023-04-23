package corejava;

interface Demo {

	void print();

	default void printnext() {
		System.out.println("IM Complete Method");
	}
}

public class DemoInterface implements Demo {
	public static void main(String[] args) {
		DemoInterface d = new DemoInterface();
		d.print();
		d.printnext();
	}

	@Override
	public void print() {
		System.out.println("DEMO INTERFACE");

	}

}
