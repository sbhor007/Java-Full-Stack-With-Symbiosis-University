package Transact_Variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	private String username;
	private transient String OTP;
	

	public Customer(String username, String oTP) {
		super();
		this.username = username;
		OTP = oTP;
	}


	@Override
	public String toString() {
		return "Customer [username=" + username + ", OTP=" + OTP + "]";
	}


	public static void main(String[] args) {
		Customer user = new Customer("Santosh", "OTP123");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cust.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cust.txt"))){
			oos.writeObject(user);
			Customer deserializedUser = (Customer) ois.readObject();
			System.out.println("Deserialized User : " + deserializedUser);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
