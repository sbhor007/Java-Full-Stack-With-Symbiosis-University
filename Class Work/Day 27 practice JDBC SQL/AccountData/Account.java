package AccountData;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Account {
	static Connection con;
	static CallableStatement callableS;
	static PreparedStatement prepareS;
	
	static {
		con = DBUTils.getConnection();
	}
	
	public static boolean insertRecord(int accountNo,String accountHolderName,double amount,String transactionType,Date transactionDate,String address) {
		boolean status = false; 
		
		String query = "{CALL insertAccount(?,?,?,?,?,?,?)}";
		try {
			callableS = con.prepareCall(query);
			callableS.setInt(1, accountNo);
			callableS.setString(2, accountHolderName);
			prepareS = con.prepareStatement("SELECT MAX(transactionNo) FROM account");
			ResultSet rs = prepareS.executeQuery();
			rs.next();
			int transactionNo = rs.getInt(1)+1;
			callableS.setInt(3, transactionNo);
			callableS.setDouble(4, amount);
			callableS.setString(5, transactionType);
			callableS.setDate(6, transactionDate);
			callableS.setString(7, address);
			int n = callableS.executeUpdate();
			if(n > 0) {
				status = true;
				System.out.println("Data Inserted");
			}
		} catch (SQLException e) {
			System.out.println("INSERT RECORD::ERROR : " + e.getMessage());
		}
		
		return  status;
	}
	public static boolean getTransactionTypeInformation(String transactionType) {
		boolean status = false;
		String query = "CALL getWithdrawInformation(?)";
		try {
			callableS = con.prepareCall(query);
			callableS.setString(1, transactionType);
			ResultSet rs = callableS.executeQuery();
			if(!rs.next())
			{
				System.out.println("Record Not Awailable");
			}else {
				status = true;
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				}while(rs.next());
			}
		} catch (SQLException e) {
			System.out.println("GET WITHDRAW INFORMATION::ERROR: " + e.getMessage());
		}
		
		return status;
	}

	public static boolean getMonthlyTransactionDetails(String month) {
		boolean status = false;
		String query = "{CALL getMonthlyTransactionDetails(?)}";

		try {
			callableS = con.prepareCall(query);
			callableS.setString(1, month);
			ResultSet rs = callableS.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable");
			} else {
				status = true;
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("GET MONTHLY TRANSACTION DETAIL::ERROR: " + e.getMessage());
		}

		return status;
	}

	public static boolean getAllTrabsactionByAccountNo(int accNo) {
		boolean status = false;

		try {
			String query = "SELECT * FROM account WHERE accountNo = ?";
			prepareS = con.prepareStatement(query);
			prepareS.setInt(1, accNo);
			ResultSet rs = prepareS.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable");
			} else {
				status = true;
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("GET ALL TRANSACTION BY ACCOUNT NO::ERROR: " + e.getMessage());
		}

		return status;
	}

	// display all the details who has done the transaction less than user amount
	public static void getTransactionsBelowAmount(int amount) {
		try {
			String query = "SELECT * FROM account WHERE amount < ?";
			prepareS = con.prepareStatement(query);
			prepareS.setInt(1, amount);
			ResultSet rs = prepareS.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable");
			} else {
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("GET TRANSACTION BELOW AMOUNT::ERROR: " + e.getMessage());
		}
	}
}
