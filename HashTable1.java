package corejava;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable1 {
	public static void main(String[] args) {
		Hashtable<Long,String> contact = new Hashtable<>();
		contact.put(9110875104l, "Ajay");
		contact.put(8867633405l, "Ajit");
		contact.put(7760201566l, "Kaka");
		
		System.out.println(contact);
		
		for(Entry<Long, String> x:contact.entrySet()) {
			System.out.println(x.getKey()+"-->"+x.getValue());
		}
	}

}
