package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {
	//database connection
	static Connection con;
//	static String mysqlUrl = "jdbc:mysql://localhost/santoshDB";
//	Exception for usessl
	static String mysqlUrl = "jdbc:mysql://localhost/santoshDB?useSSL=false";
	
	static void testConnection() {
		try {
			con = DriverManager.getConnection(mysqlUrl,"root","mysql80");
			System.out.println("Connection Establish");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		testConnection();
	}

}
