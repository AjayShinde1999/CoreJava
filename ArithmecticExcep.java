package corejava;

public class ArithmecticExcep {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			System.out.println(x/y);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception Handling");
		}
	}

}
