package corejava;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> x = new HashMap<>();
		x.put("Gulbarga", 585103);
		x.put("Bidar", 585100);
		x.put("Sedam", 585106);
		x.put(null, 585100);

		for (HashMap.Entry<String, Integer> x1 : x.entrySet()) {
			System.out.println(x1.getKey() + " -> " + x1.getValue());
		}
	}

}
