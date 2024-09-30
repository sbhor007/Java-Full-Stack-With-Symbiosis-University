package Day25_procegers_Callable;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Callble_Procidure {
	
	public static int insertEmployee(int empId,String empName,String dept,double salary) {
		int n = 0;
		
		Connection con = null;
		CallableStatement callableS;
		
		
		try {
			String query = "{CALL insertEmployeeRecord(?,?,?,?)}";
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/santoshDb?useSSL=false","root","mysql80");
			System.out.println("Connection Success");
			callableS = con.prepareCall(query);
			callableS.setInt(1, empId);
			callableS.setString(2, empName);
			callableS.setString(3, dept);
			callableS.setDouble(4, salary);
			n = callableS.executeUpdate();
			if(n > 0) {
				System.out.println("Record Inserted");
				ResultSet rs = callableS.executeQuery("select * from employee1");
				if(!rs.next()) {
					System.out.println("Record Not Available");
				}else {
					do {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4) );
					}while(rs.next());
				}
			}
			else {
				System.out.println("record not inserted");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return n;
	}

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		char choice;
		do {
			try {
				System.out.println("Enter Employee details");
				System.out.println("Emp Id : ");
				int empId = scan.nextInt();
				System.out.println("name : ");
				String empName = scan.next();
				System.out.println("department : ");
				String dept = scan.next();
				System.out.println("Salary : ");
				double salary = scan.nextDouble();
				
				System.err.println(insertEmployee(empId, empName, dept, salary));
				
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scan.next();
			}
			System.out.print("Enter Your Choice (y/n) : ");
			choice = scan.next().toUpperCase().charAt(0);
		}while(choice == 'Y');
		System.out.println("Program Terminated");
	}

}
