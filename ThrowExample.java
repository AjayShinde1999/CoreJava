package corejava;

import java.util.Scanner;

class InsufficientFunds extends Throwable {

}

public class ThrowExample {
	public static void main(String[] args) {
		int balance = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();

		if (balance >= amount) {
			System.out.println("Please collect the cash!!");
		} else {
			try {
				throw new InsufficientFunds();
			} catch (InsufficientFunds e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}
		sc.close();
	}

}
