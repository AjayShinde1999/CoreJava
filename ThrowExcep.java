package corejava;

class ApplicationCrashed extends Throwable {

}

public class ThrowExcep {
	public static void main(String[] args) {
		try {
			throw new ApplicationCrashed();

		} catch (ApplicationCrashed e) {
			System.out.println("Application Re-starting");
		}
	}

}
