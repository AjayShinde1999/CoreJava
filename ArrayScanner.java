package corejava;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int[] x = new int[size];
		
		for(int i=0; i<x.length; i++) {
			System.out.println("Enter the elements");
			x[i] = sc.nextInt();
		}
		
		System.out.println("The Elements Are : ");
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}

}
