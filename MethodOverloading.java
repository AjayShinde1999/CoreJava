package corejava;

public class MethodOverloading {

	void studentInfo(String name, String college) {
		System.out.println("Student name is = " + name);
		System.out.println("Student college is = " + college);
	}

	void studentInfo(int rollNo, long mobile) {
		System.out.println("Student roll number is =" + rollNo);
		System.out.println("Student mobile number is =" + mobile);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.studentInfo("Ajay Shinde", "VTU");
		m.studentInfo(7, 9110875104l);
	}

}
