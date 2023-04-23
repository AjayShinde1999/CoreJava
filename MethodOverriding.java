package corejava;

class SilverAccount {
	void onlineBanking() {
		System.out.println("YES");
	}

	void chqBook() {
		System.out.println("UNLIMITED");
	}

	void rateOfInterest() {
		System.out.println("NIL");
	}
}

class GoldAccount1 extends SilverAccount {

	void rateOfInterest() {
		System.out.println("6% rate of interest");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
       GoldAccount1 g = new GoldAccount1();
       g.onlineBanking();
       g.chqBook();
       g.rateOfInterest();
	}
}