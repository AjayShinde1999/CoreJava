package corejava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of LinkedList");
		int size = sc.nextInt();
		LinkedList<Integer> x = new LinkedList<Integer>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the values");
			int values = sc.nextInt();
			x.add(values);
		}
		System.out.println(x);
		
		Iterator<Integer> itr = x.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
