package factory;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	static Connection con;
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbb3_todo", "root", "12345");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}