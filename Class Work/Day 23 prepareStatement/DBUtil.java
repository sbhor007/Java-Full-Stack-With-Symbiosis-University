package Day23_prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	private static final String DB_DRIVER_CLASS = "con.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "mysql80";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/santoshDb?useSSL=false";
	
	public static Connection getConnection() {
		try {
//			Class.forName(DB_DRIVER_CLASS); // to load database driver
			System.out.println("Driver Loaded Successfully....");
			con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection Establish successfully...");
		} catch (SQLException e) {
			System.out.println("CONNECTION : " + e.getMessage());
		}
//		catch (ClassNotFoundException e) {
//			System.out.println("CLASS ERROR CONNECTION"+e.getMessage());
//		}
	return con;	
	}

}


