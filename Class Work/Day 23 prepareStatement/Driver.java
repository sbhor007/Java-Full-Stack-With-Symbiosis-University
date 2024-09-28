package Day23_prepareStatement;

public class Driver {

	public static void main(String[] args) {
		System.out.println(PrepareStatementExample.addVisiter(10, "Dipak", "M", 3600, "Nashik"));
		System.out.println(PrepareStatementExample.validateVisiter(1001));
		System.out.println(PrepareStatementExample.deleteVisiter(10));
		System.out.println(PrepareStatementExample.updateVisiterName(1001, "Yash"));
		PrepareStatementExample.showVisiters();
		PrepareStatementExample.closeConnection();
	}

}
