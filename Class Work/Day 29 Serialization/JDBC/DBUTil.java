package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUTil {
	public static Connection con;
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "mysql80";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/santoshDb?useSSL=false";
	
	public static Connection getConnection() {
		
		try {
			con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection Successfully...");
		} catch (SQLException e) {
			System.out.println("GET CONNECTION::ERRO : " + e.getMessage());
		}
		return con;
	}
}