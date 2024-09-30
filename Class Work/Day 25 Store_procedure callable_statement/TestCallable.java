package Day25_procegers_Callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class TestCallable {
	public static void getAllEmployee() {
		Connection con = null;
		CallableStatement callableS;
		
		String query = "{CALL getAllEmployee()}";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/santoshDb?useSSL=false","root","mysql80");
			System.out.println("Connection Success");
			callableS = con.prepareCall(query);
			ResultSet rs = callableS.executeQuery();
			if(!rs.next()) {
				System.out.println("Record Not Available");
			}else {
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4) );
				}while(rs.next());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		/*try {
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			if(!rs.next()) {
				System.out.println("Record Not Available");
			}else {
				do {
					System.out.println(rs.getInt(1));
				}while(rs.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAllEmployee();

	}

}
