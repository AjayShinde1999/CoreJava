package corejava;

class Account {
	void onlineBanking() {
		System.out.println("YES");
	}
}

class SilverAcoount extends Account {
	void rateOfInterest() {
		System.out.println("NIL");
	}
}

class GoldAccount extends Account {
	void rateOfInterest() {
		System.out.println("6% rate of interest");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.onlineBanking();
		g.rateOfInterest();
	}

}