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
}

/*
create table account(
accountNo int not null primary key,
accountHolderName varchar(15),
transactionNo int,
amount double,
transactionType varchar(15),
transactionDate date,
address varchar(15)
);
*/