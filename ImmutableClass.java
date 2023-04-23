package corejava;

final public class ImmutableClass {

	private final String name;

	ImmutableClass(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		ImmutableClass i = new ImmutableClass("Ajay Shinde");
		System.out.println(i.getName());
	}

}
