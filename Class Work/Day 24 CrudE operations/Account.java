package SQLPractice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Account {
	static Connection con;
	static PreparedStatement pst;

	static {
		con = DBUtils.getConnection();
		if (con != null) {
			System.out.println("JDBC: Connection Taken.");
		} else {
			System.out.println("JDBC: Connection Fail.");
		}
	}

	public static int validateAccount(int accountNo) {
		int n = 0;

		try {
			pst = con.prepareStatement("SELECT COUNT(*) FROM account WHERE accountNo = ?");
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}
		} catch (SQLException e) {
			System.out.println("VALIDATE ACCOUNT::ERROR : " + e.getMessage());
		}
		return n;
	}

	public static void showTransactionType(String transactionType) {

		try {
			pst = con.prepareStatement("SELECT * FROM account WHERE transactionType LIKE ?");
			pst.setString(1, transactionType);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				}
			} else {
				System.out.println("Record Not Available");
			}
		} catch (SQLException e) {
			System.out.println("SHOW TRANSACTION TYPE::ERROR : " + e.getMessage());
		}

	}

//	display a/c no, name and amount, for all deposit and withdrawal done in the month of may
	public static void showBothTransactionTypeAndInMonth(int month) {
		try {
			pst = con.prepareStatement(
					"SELECT * FROM account WHERE transactionType in (?,?) AND transactionDate LIKE ?");
			pst.setString(1, "deposit");
			pst.setString(2, "withdraw");
			pst.setString(3, "%-05-%");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(4));
				}
			} else {
				System.out.println("Record Not Awailable..");
			}
		} catch (SQLException e) {
			System.out.println("SHOW TRANSACTION TYPE AND MONTH::ERROR : " + e.getMessage());
		}

	}

//	display all the transaction done by accNo 1001
//	TODO: only one Transaction display
	public static void showAllTransactions(int accountNo) {
		try {
			pst = con.prepareStatement("SELECT * FROM account WHERE accountNo = ?");
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");
			} else {
				System.out.println("List of transation of + " + rs.getString(2));
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("SHOW All TRANSACTION::ERROR : " + e.getMessage());
		}
	}

//	display all the details who has done the transaction less than 50000
	public static void showTransactionsBasedAmount(double amount) {

		try {
			pst = con.prepareStatement("SELECT * FROM account WHERE amount < ? ");
			pst.setDouble(1, amount);
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");
			} else {
				System.err.println("List of transactions where amount less than 50000");
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));
				} while (rs.next());

			}
		} catch (SQLException e) {
			System.out.println("SHOW TRANSACTION BASED AMOUNT::ERROR : " + e.getMessage());

		}

	}

//	select all the a/c holders whose address and who are not from pune and Mumbai
	public static void showAccountHoldersNotPuneMumbai() {

		try {
			pst = con.prepareStatement("SELECT * FROM account WHERE address not in (?,?)");
			pst.setString(1, "pune");
			pst.setString(2, "mumbai");
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");

			} else {
				System.out.println("Account details for who are not from pune and mumbai");
				do {
					{
						System.out.println(rs.getString(2) + "\t" + rs.getString(7));
					}
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("SHOW ACCOUNT HOLDERS PUNE MUMBAI::ERROR : " + e.getMessage());
		}
	}

//	select unique locations and how many of them
	public static void countLocations() {
		try {
			pst = con.prepareStatement("SELECT COUNT(DISTINCT(address)) FROM account");
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");

			} else {
				System.out.print("No Of Unique locations : ");
				do {
					{
						System.out.println(rs.getInt(1));
					}
				} while (rs.next());
			}
		} catch (SQLException e) {
			System.out.println("COUNT LOCATIONS::ERROR : " + e.getMessage());

		}

	}

//	select min and max transaction amount in a month of may
	public static void findMinMaxAmountWithMonth(int month) {
		try {
			pst = con.prepareStatement("SELECT MIN(amount),MAX(amount) FROM account where transactionDate like ?");
			String tDate = "%-" + month + "-%";
			if (month < 10) {
				tDate = "%-0" + month + "-%";
			}
			System.out.println(tDate);
			pst.setString(1, tDate);
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");

			} else {

				System.out.println("Maximum Ammount\t Minimum Ammount \n" + rs.getInt(1) + "\t\t " + rs.getInt(2));

			}
		} catch (SQLException e) {
			System.out.println("FIND MIN MAX::ERROR : " + e.getMessage());

		}
	}

// display total transaction till know 
	public static void countTransactionsInADate(Date transactionDate) {
		try {
			pst = con.prepareStatement("SELECT * FROM account WHERE transactionDate like ?");
			pst.setDate(1, transactionDate);
			ResultSet rs = pst.executeQuery();
			if (!rs.next()) {
				System.out.println("Record Not Awailable..");

			} else {
				do {
					{
						System.out.println(
								rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getDouble(4)
										+ "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t" + rs.getString(7));

					}
				} while (rs.next());
			}

		} catch (SQLException e) {
			System.out.println("Count ::ERROR : " + e.getMessage());
		}
	}
}
