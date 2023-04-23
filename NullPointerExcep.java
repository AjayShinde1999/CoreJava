package corejava;

public class NullPointerExcep {
	static NullPointerExcep a1;
	int x = 100;

	public static void main(String[] args) {
		try {
			System.out.println(a1.x);
		} catch (NullPointerException e) {
			System.out.println("Exception Handling");
		}
	}

}
