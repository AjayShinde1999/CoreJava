package corejava;

public class Student {

	Student(String name, String college) {
		System.out.println("Student Name is : " + name);
		System.out.println("College Name is : " + college);

	}

	Student(int rollNo, long mobileNo) {
		
		System.out.println("Roll Number is : " + rollNo);
		System.out.println("Mobile Number is : " + mobileNo);
	}

	public static void main(String[] args) {
		new Student("Ajay Shinde", "VTU");
		new Student(7, 9110875104l);
	}

}
