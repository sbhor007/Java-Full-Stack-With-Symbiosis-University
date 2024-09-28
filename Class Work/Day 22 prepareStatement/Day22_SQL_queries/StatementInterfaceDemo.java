package Day22_SQL_queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterfaceDemo {

	static Connection cn;
	static Statement st;
	static {
		cn = DBUTil.getConnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int addEmployee(int empId, String empName, String dept, double empSalary) {
		int n = 0;

		try {
			String query = "INSERT INTO employee1 VALUES(" + empId + ",'" + empName + "','" + dept + "'," + empSalary
					+ ")";
			n = st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("INSERT EMPLOYEE : " + e.getMessage());
		}
		return n;
	}

	public static int validateEmp(int empId) {
		int n = 0;

		try {
			String query = "SELECT count(*) FROM employee1 WHERE empNo = " + empId;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}
		} catch (SQLException e) {
			System.out.println("VALIDATE EMPLOYEE : " + e.getMessage());
		}

		return n;
	}

	public static boolean deleteEmp(int empId) {
		boolean status = false;
		try {
			int n = validateEmp(empId);
			if (n == 1) {
				String query = "DELETE FROM employee1 WHERE empNo = " + empId;
				st.executeUpdate(query);
				status = true;
			}else {
				System.out.println("No Such employee records...");
			}
		} catch (SQLException e) {
			System.out.println("DELETE EMPLOYEE : " + e.getMessage());
		}
		return status;
	}

	public static boolean updateEmpName(int empId, String empName) {
		boolean status = false;

		try {
			if (validateEmp(empId) == 1) {
				String query = "UPDATE employee1 SET empName = '" + empName + "' WHERE empNo = " + empId;
				st.executeUpdate(query);
				status = true;
			} else {
				System.out.println("No Such employee records...");
			}
		} catch (SQLException e) {
			System.out.println("UPDATE EMPLOYEE NAME : " + e.getMessage());
		}
		return status;
	}

	public static boolean updateEmpSalary(int empId, double salary) {
		boolean status = false;

		try {
			if (validateEmp(empId) == 1) {
				String query = "UPDATE employee1 SET salary = '" + salary + "' WHERE empNo = " + empId;
				st.executeUpdate(query);
				status = true;
			} else {
				System.out.println("No Such employee records...");
			}
		} catch (SQLException e) {
			System.out.println("UPDATE EMPLOYEE SALARY : " + e.getMessage());
		}
		return status;
	}

	public static void showEmp() {
		
		
		try {
			String query = "SELECT * FROM employee1";
			ResultSet rs =  st.executeQuery(query);
//			System.out.println(rs.next());
//			System.out.println("--------------");
//			System.out.println(":::" + rs.getInt(1));
			if(rs.next()) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) +"\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" +rs.getDouble(4));
				}
			}else {
				System.out.println("No Employee awailable");
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println("SHOW EMPLOYEE : " + e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			System.out.println("CLOSE CONNECTION :" + e.getMessage());
		}
		
	}
	
}
