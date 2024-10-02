package AccountData;

import java.sql.Date;

public class Driver {
	public static void main(String[] args) {
		System.out.println(Account.insertRecord(1001, "SAntosh", 78552, "withdraw", Date.valueOf("2024-07-22"), "Nashik"));
	}
}
