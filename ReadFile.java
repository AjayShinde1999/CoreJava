package corejava;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		File f = new File("D://Shinde/ajay.txt");
		try {
			FileReader fr = new FileReader(f);

			for (int i = 0; i < f.length(); i++) {
				System.out.print((char) fr.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
