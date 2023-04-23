package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeapp", "root", "test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("Insert into registration values('Shinde','Gulbarga','shinde@gmail.com','9110875104')");
			con.close();
		} catch (Exception e) {
		}
	}

}
