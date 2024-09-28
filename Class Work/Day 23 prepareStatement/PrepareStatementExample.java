package Day23_prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementExample {
	static Connection con;
	static PreparedStatement pst;
	static {
		con = DBUtil.getConnection();
		if (con != null) {
			System.out.println("JDBC: Connection is taken !");
		} else {
			System.out.println("JDBC: Connection is Fail !");
		}
	}

	public static int addVisiter(int visiterId, String visiterName, String gender, double amountPaid, String location) {
		int n = 0;

		try {
			pst = con.prepareStatement("INSERT INTO visiter values(?,?,?,?,?)");
			pst.setInt(1, visiterId);
			pst.setString(2, visiterName);
			pst.setString(3, gender); // TODO: character
//			pst.setObject(3, 'c',java.sql.Types.CHAR); for character data types
			pst.setDouble(4, amountPaid);
			pst.setString(5, location);
			n = pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ADD VISITOR ::ERROR:" + e.getMessage());
		}
		return n;
	}

	public static int validateVisiter(int visiterId) {
		int n = 0;

		try {
			pst = con.prepareStatement("SELECT count(*) FROM visiter WHERE visiterId = ?");
			pst.setInt(1, visiterId);
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}
		} catch (SQLException e) {
			System.out.println("VALIDATE VISITER ::ERROR: " + e.getMessage());
		}
		return n;
	}

	public static boolean deleteVisiter(int visiterId) {
		boolean status = false;

		try {
			int n = validateVisiter(visiterId);

			if (n == 1) {
				pst = con.prepareStatement("DELETE FROM visiter where visiterId = ?");
				pst.setInt(1, visiterId);
				pst.executeUpdate();
				status = true;
			}
		} catch (SQLException e) {
			System.out.println("DELETE VISITER ::ERROR: " + e.getMessage());
		}
		return status;
	}

	public static boolean updateVisiterName(int visiterId, String visiterName) {
		boolean status = false;

		try {
			int n = validateVisiter(visiterId);
			if (n == 1) {
				pst = con.prepareStatement("UPDATE visiter SET visiterName = ? WHERE visiterId = ?");
				pst.setString(1, visiterName);
				pst.setInt(2, visiterId);
				pst.executeUpdate();
				status = true;
			}
		} catch (SQLException e) {
			System.out.println("UPDATE VISITER NAME ::ERROR: " + e.getMessage());
		}

		return status;
	}
	
	public static void showVisiters() {
		try {
			pst=con.prepareStatement("SELECT * FROM visiter");
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4) + "\t" + rs.getString(5));
				}
			}else {
				System.out.println("NO VISITER DATA AVAILABLE");
			}
		} catch (SQLException e) {
			System.out.println("SHOW VISITER ::ERROR: " + e.getMessage());
		}
	}
	public static void closeConnection() {
		try {
			pst.close();
			con.close();
			System.out.println("Clonnection Closed");
		} catch (SQLException e) {
			System.out.println("CONNECTION CLOSE VISITER ::ERROR: " + e.getMessage());
		}
	}
}
