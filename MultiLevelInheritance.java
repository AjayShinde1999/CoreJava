package corejava;

class Animal {
	void eat() {
		System.out.println("EATING.....");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("BARKING.....");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("WEEPING......");
	}
}

public class MultiLevelInheritance extends BabyDog {
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weep();
	}
}