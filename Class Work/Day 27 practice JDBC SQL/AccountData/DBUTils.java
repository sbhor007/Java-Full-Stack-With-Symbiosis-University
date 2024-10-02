package AccountData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUTils {
	private static Connection con;
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "mysql80";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/santoshDb?useSSL=false";

	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection Successfull...");
		} catch (SQLException e) {
			System.out.println("System.out.println(\"GET CONNECTION::ERRO : \" + e.getMessage()");
		}
		return con;
	}
}
