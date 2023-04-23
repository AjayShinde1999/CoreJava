package corejava;

public class Student1 {

	Student1(String name, String college) {
		System.out.println("Student Name is = " + name);
		System.out.println("College Name is = " + college);
	}

	Student1(int rollNo, long mobile) {
		this("Ajay Shinde", "VTU");
		System.out.println("Roll Number is = " + rollNo);
		System.out.println("Mobile Number is = " + mobile);
	}

	public static void main(String[] args) {
		new Student1(7, 9110875104l);
	}

}
