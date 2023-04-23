package corejava;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(5);
		x.add(null);
		
		System.out.println(x);
		Iterator<Integer> itr = x.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
