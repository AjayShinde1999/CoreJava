package corejava;

public class Encapsulation {

	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("Ajay Shinde");
		String name = e.getName();
		System.out.println(name);
	}

}
