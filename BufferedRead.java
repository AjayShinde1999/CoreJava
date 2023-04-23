package corejava;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedRead {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://Shinde/ajay.txt");
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());

		} catch (Exception e) {
		}
	}

}
