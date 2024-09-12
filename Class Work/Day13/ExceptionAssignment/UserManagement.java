package ExceptionAssignment;

import java.util.Scanner;

class UserAgeException extends Exception{
	public UserAgeException(String massage) {
		super(massage);
	}
}

class UserIdException extends Exception{
	public UserIdException(String massage) {
		super(massage);
	}
}

class User{
	protected static int ID;
	int userId;
	protected String username;
	private int age;
	 static {
		 ID = 1000;
	 }
	 
	public User() {
		this.userId = ID;
//		this.username = username;
//		this.age = age;
		ID++;
	}
	
	public int getUserId() {
		return userId;
	}

//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws UserAgeException {
		if(age < 18 || age > 68)
			throw new UserAgeException("Invalid User Age..");
		else
			this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", age=" + age + "]";
	}
	
}

public class UserManagement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username;
		int age,userId;
		User[] user = new User[2];
		for(int i = 0; i <2;i++) {
		System.out.println("Enter User Name : ");
		username = scan.next();
		System.out.println("Enter User Age : ");
		age = scan.nextInt();
		user[i] = new User();
		try {
			user[i].setUsername(username);
			user[i].setAge(age);
		}catch(UserAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(user[i]);
		
		System.out.println("enter user ID to find it : ");
		userId = scan.nextInt();
		try {
			if(user[i].getUserId() != userId) {
				throw new UserIdException("Invalid user id ");
			}else {
				System.out.println(user[i]);
			}
		}catch(UserIdException e){
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}}
		
		

	}

}
