package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcRead {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeapp", "root", "test");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("Select * from registration");
			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
		} catch (Exception e) {
		}
	}

}
