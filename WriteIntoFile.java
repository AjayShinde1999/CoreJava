package corejava;

import java.io.FileWriter;

public class WriteIntoFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://Shinde/ajit.txt", true);
			fw.write("Ajit Shinde");
			fw.write("\n");
			fw.write("How are you");
			fw.close();
		} catch (Exception e) {
		}
	}

}
