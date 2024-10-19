package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CrudeOperation {
	static Connection con;
	static PreparedStatement prepareS;
	static {
		con = DBUTil.getConnection();
		if (con != null) {
			System.out.println("JDBC: Connection is taken !");
		} else {
			System.out.println("JDBC: Connection is Fail !");
		}
	}
	public static int insertEmployee(Employee e) {
		int n =0;
		
		try {
			String query = "INSERT INTO employee11 VALUES(?,?,?)";
			prepareS = con.prepareStatement(query);
			prepareS.setInt(1, e.getEmpId());
			prepareS.setString(2, e.getFirstName());
			prepareS.setString(3, e.getLastName());
			n = prepareS.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return n;
	}
	public static ArrayList<Employee> getEmployee(){
		ArrayList<Employee> employees= new ArrayList<Employee>();
		System.out.println("get Employee");
		try {
			prepareS = con.prepareStatement("SELECT * FROM employee11");
			ResultSet rs = prepareS.executeQuery();
			if(rs.next()) 
			{
				do {
					//System.out.println(rs.getString(2));
					Employee e = new Employee();
					e.setEmpId(rs.getInt(1));
					e.setFirstName(rs.getString(2));
					e.setLastName(rs.getString(3));
					employees.add(e);
					System.out.println(e);
					
				}while(rs.next());
			}
		} catch (SQLException ex) {
			
			ex.printStackTrace();
		}
		
		return employees;
	}
	
}
