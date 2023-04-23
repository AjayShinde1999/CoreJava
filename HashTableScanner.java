package corejava;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashTableScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		Hashtable<String, Integer> studentInfo = new Hashtable<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Roll no.");
			Integer rollNo = sc.nextInt();
			studentInfo.put(name, rollNo);
		}

		System.out.println("List of Students");

		for (Entry<String, Integer> x : studentInfo.entrySet()) {
			System.out.println(x.getKey() + "--->" + x.getValue());

		}
	}

}
