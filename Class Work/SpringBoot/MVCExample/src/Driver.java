
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trg.Controller.EmpContrpller;
import com.trg.Model.Employee;
import com.trg.View.EmpView;

public class Driver {

	static SessionFactory sessionFactory;
	static {
		sessionFactory =  new Configuration().configure().buildSessionFactory();
	}
	
	
	static public void saveEmployee(Employee e) {
		try {
			 Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 session.save(e);
			 transaction.commit();
			 session.close();
			 System.out.println("Employee Saved");
		} catch (Exception e2) {
			System.out.println(e2);
		} finally {
			
		}
	}
	
	static public Employee getEmployee(String id) {
		try {
			System.out.println(id);
			Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 Employee e = (Employee) session.get(Employee.class, id);
			 transaction.commit();
			 session.close();
			 return e;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	static void updateEmployee(Employee e) {
		try {
			 Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 session.update(e);
			 transaction.commit();
			 session.close();
			 System.out.println("Employee Saved");
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmployeeName("Dipak");
		e.setEmployeeId("18");
		e.setEmployeeDepartment("Salesforce");
		saveEmployee(e);
		
		Employee model = retriveEmployeeFromDatabase("18");
		System.out.println(model);
		// create a view ti write Employee details on console
		EmpView view = new EmpView();
		
		EmpContrpller controller = new EmpContrpller(model, view);
		
		controller.updateView();
		
		//updating the model data
		model.setEmployeeName("Santosh");
		updateEmployee(model);
		System.out.println("\nEmployee DEtails after updating : ");
		
		controller.updateView(); 
	}

	private static Employee retriveEmployeeFromDatabase(String id) {
		
System.out.println(id);
		Employee e = getEmployee(id);
		if(e != null)
			return e;
		else {
			System.out.println("not Found");
			return null;
		}
		
		
	}
	

}
