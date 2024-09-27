package Day21_Examples;

import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuDrivenSQL {
	static Connection con;
	static String mysqlUrl = "jdbc:mysql://localhost/santoshDB?useSSL=false";
	

	public void insertData(int empCode, String empName, String gender, String grade, int gross, LocalDate dob) {
		try {
			int n;
			con = DriverManager.getConnection(mysqlUrl, "root", "mysql80");
			Statement smt = con.createStatement();

			String query = "INSERT INTO employee VALUES(" + empCode + ",'" + empName + "','" + gender + "','" + grade
					+ "'," + gross + ",'" + dob +"')";

			n = smt.executeUpdate(query);
			if (n > 0) {
				System.out.println("Record Inserted Successfully.....");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateName(String empName, int empCode) {
		int n;
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "mysql80");
			Statement smt = con.createStatement();

			String query = "UPDATE employee SET ename = '" + empName + "' WHERE(ecode = " + empCode + ")";
			n = smt.executeUpdate(query);
			if (n > 0) {
				System.out.println("Updated");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteData(int empCode) {
		int n;
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "mysql80");
			Statement smt = con.createStatement();

			String query = "DELETE FROM employee WHERE ecode = " + empCode;
			n = smt.executeUpdate(query);
			if (n > 0) {
				System.out.println("Record Deleted");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void displayData() {
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "mysql80");
			Statement smt = con.createStatement();
			ResultSet result = smt.executeQuery("SELECT * FROM employee");
			// print result
			while (result.next()) {
				System.out.println(result.getInt(1) + "\t" + result.getString(1) + "\t" + result.getString(2) + "\t"
						+ result.getString(3) + "\t" + result.getString(4) + "\t" + result.getInt(5) + "\t" + result.getDate(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MenuDrivenSQL employee = new MenuDrivenSQL();
		char ch;

		do {

			try {
				System.out.print(
						"\n1. Insert Record\n2. Uddate record\n3. Delete Record\n4. Display Records\nEnter Choice : ");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					char cha;
					do {
						try {
							System.out.println("Enter Employee Details");
							System.out.print("Code : ");
							int empCode = scan.nextInt();

							System.out.print("Name : ");
							String empName = scan.next();

							System.out.print("Gender : ");
							String gender = scan.next();

							System.out.print("Grade : ");
							String grade = scan.next();
							
							System.out.print("Date Of Birth (YYYY-MM-DD) : ");
							String DOB = scan.next();

							System.out.print("Gross : ");
							int gross = scan.nextInt();
							employee.insertData(empCode, empName, gender, grade, gross,LocalDate.parse(DOB));
						} catch (Exception e) {
							System.out.println(e.getMessage());
							scan.nextLine();
						}
						System.out.print("Do You want to add another Record (y/n) : ");
						cha = scan.next().charAt(0);
					} while (cha == 'y' || cha == 'Y');
					break;
				case 2:
					System.out.print("Employee Code : ");
					int empCode = scan.nextInt();

					System.out.print("Employee Name : ");
					String empName = scan.next();

					employee.updateName(empName, empCode);
					break;
				case 3:
					System.out.print("Employee Code : ");
					int eCode = scan.nextInt();

					employee.deleteData(eCode);
					break;

				case 4:
					employee.displayData();
					break;
				default:
					System.out.println("Invalid Input...");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.print("Go For Main Menu (y/n) : ");
			ch = scan.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
		System.out.println("Program terminated...");

	}

}
