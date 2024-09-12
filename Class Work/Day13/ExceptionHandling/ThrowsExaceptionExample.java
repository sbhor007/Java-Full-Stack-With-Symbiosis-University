package ExceptionHandling;

class UserException extends Exception{
	public UserException(String s) {
		super(s);
	}
}

class InvalidCountryException extends Exception{
	public InvalidCountryException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}

public class ThrowsExaceptionExample {
	
	String countryName;
	public void registerUser(String countryName) throws InvalidCountryException,UserException{
		if(!countryName.equals("India")) {
			throw new InvalidCountryException("NRI is not allowed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExaceptionExample obj = new ThrowsExaceptionExample();
		try {
			obj.registerUser("India");
		}catch (InvalidCountryException | UserException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
