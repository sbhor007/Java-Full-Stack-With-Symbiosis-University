package StudentData;

import java.lang.invoke.StringConcatException;
import java.sql.*;
import java.text.CollationElementIterator;

public class Student {
	static Connection con;
	static CallableStatement callableS;
	static PreparedStatement prepareS;
	static {
		con = DBUtill.getConnection();
	}

	private static int getStudId() {

		try {
			prepareS = con.prepareStatement("select max(studId) from student");
			ResultSet rs = prepareS.executeQuery();
			if (rs.next())
				return rs.getInt(1);

		} catch (SQLException e) {
			System.out.println("GET STUD ID::ERRO : " + e.getMessage());

		}
		return -1;

	}

	public static void showData() {
		String query = "CALL showStudent()";
		try {
			callableS = con.prepareCall(query);
			ResultSet rs = callableS.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Found");
			} else {
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("SHOW DATA::ERROR: " + e.getMessage());
		}
	}

	public static int insert(String studName, int marks) {
		int n = 0;

		try {
			String query = "{ CALL insertStudent(?,?,?) }";

			int studId = getStudId() + 1;
			callableS = con.prepareCall(query);
			callableS.setInt(1, studId);
			callableS.setString(2, studName);
			callableS.setInt(3, marks);
			n = callableS.executeUpdate();
			if (n > 0) {
				System.out.println("Data Inserted successfull");
			}
		} catch (SQLException e) {
			System.out.println("INSERT::ERRO : " + e.getMessage());

		}
		return n;
	}

	public static int minMarks() {
		try {
			prepareS = con.prepareStatement("select min(totalMarks) from student");
			ResultSet rs = prepareS.executeQuery();
			if (rs.next())
				return rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("MIN MARKS::ERROR: " + e.getMessage());
		}
		return -1;
	}

	public static int maxMarks() {
		try {
			prepareS = con.prepareStatement("select max(totalMarks) from student");
			ResultSet rs = prepareS.executeQuery();
			if (rs.next())
				return rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("MAX MARKS::ERROR: " + e.getMessage());
		}
		return -1;
	}

	public static int avgMarks() {
		try {
			prepareS = con.prepareStatement("select avg(totalMarks) from student");
			ResultSet rs = prepareS.executeQuery();
			if (rs.next())
				return rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("AVG MARKS::ERROR: " + e.getMessage());
		}
		return -1;
	}

	public static void deleteRecord(int studId) {
		String query = "{CALL deleteStudent(?)}";
		try {
			callableS = con.prepareCall(query);
			callableS.setInt(1, studId);
			int n = callableS.executeUpdate();
			if (n > 0) {
				System.out.println("Delete Record successfull");
			}else {
				System.out.println("Record Not Found");
			}
		} catch (SQLException e) {
			System.out.println("DELETE RECORD::ERROR: " + e.getMessage());
		}
	}

	public static void updateRecord(String studName, int studId) {
		String query = "{CALL updateStudentName(?,?)}";
		try {
			callableS = con.prepareCall(query);
			callableS.setString(1, studName);
			callableS.setInt(2, studId);
			int n = callableS.executeUpdate();
			if (n > 0) {
				System.out.println("Record Updated successfull");
			}else {
				System.out.println("Record Not Found");
			}
		} catch (SQLException e) {
			System.out.println("UPDATE RECORD::ERROR: " + e.getMessage());
		}

	}
	
	public static void closeConnection() {
		try {
			con.close();
			prepareS.close();
			callableS.close();
		} catch (SQLException e) {
			System.out.println("CLOSE CONNECTION::ERROR: " + e.getMessage());
		}
		
	}
}
