package Day22_SQL_queries;

import java.sql.Connection;

public class Driver {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("-----------------------");
		System.out.println(StatementInterfaceDemo.updateEmpName(1002, "Aditya"));
		StatementInterfaceDemo.updateEmpSalary(1003, 500000);
		System.out.println("\n-------After updateing name and salary----------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(1005);
		StatementInterfaceDemo.deleteEmp(1);
		System.out.println("\n----------After Deleting----------");
		StatementInterfaceDemo.showEmp();
	}

}
