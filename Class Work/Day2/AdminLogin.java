import java.util.*;
public class AdminLogin {
		private String adminUsername = "admin", adminPassword = "admin";
		private String username,password;
		
		public AdminLogin(String username,String password) {
			this.username = username;
			this.password = password;
		}
		public boolean isValidateLogin() {
			if(this.adminUsername.compareTo(this.username) == 0 && this.adminPassword.compareTo(password) == 0)
				return true;
			return false;
			
		}
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter User Name : ");
		String username = scan.next();
		System.out.print("Enter Password : ");
		String password = scan.next();
		
//		System.out.print(username.compareTo("admin"));
		AdminLogin admin = new AdminLogin(username,password);
		if(admin.isValidateLogin()) {
			System.out.println("Login Success");
		}else {
			System.out.println("Wrong username and password");
		}
		

	}

}
