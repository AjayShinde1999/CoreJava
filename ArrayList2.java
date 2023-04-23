package corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the values");
			int values = sc.nextInt();
			x.add(values);
		}
		System.out.println(x);
	}

}
