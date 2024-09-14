package Day17Assignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Mobile {
	private int mobileId, mobileNo;
	private String modelNo, mobileName, serviceProvider;

	public Mobile(int mobileId, String modelNo, String mobileName, String serviceProvider, int mobileNo) {
		super();
		this.mobileId = mobileId;
		this.mobileNo = mobileNo;
		this.modelNo = modelNo;
		this.mobileName = mobileName;
		this.serviceProvider = serviceProvider;
	}

	@Override
	public String toString() {
		return "Mobile [\nmobile Id : " + mobileId + "\nmodel number: " + modelNo + "\nmobile Name : " + mobileName
				+ "\nservice Provider : " + serviceProvider + "\nmobileNo=" + mobileNo + "\n]";
	}

}

public class MobileList {

	public static void main(String[] args) {
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		Scanner scan = new Scanner(System.in);
		char ch = 'n';
		
			do {
				int choice, mobileId=0, mobileNo;
				String modelNo, mobileName, serviceProvider;
				System.out.println("\n1. To Add Mobile Detais.\n2. To display Mobile Records");
				System.out.print("Enter Your Choice : ");
				choice = scan.nextInt();
					
				try {
						
				switch (choice) {
				case 1:
						System.out.println("\nEnter Mobile Details");
						System.out.println("-----------------------------");
						try {
						System.out.print("Mobile ID : ");
						mobileId = scan.nextInt();
						}catch(InputMismatchException e) {System.out.println("Aa");}
						scan.next();
						System.out.print("Model no : ");
						modelNo = scan.next();
						System.out.print("Mobile Name : ");
						mobileName = scan.next();
						System.out.print("Service Provider : ");
						serviceProvider = scan.next();
						System.out.println("Mobile No : ");
						mobileNo = scan.nextInt();

						mobiles.add(new Mobile(mobileId, modelNo, mobileName, serviceProvider, mobileNo));
					
				
					break;
					
				case 2:
					System.out.println("\nMobile details");
					System.out.println("------------------");

					for (Mobile m : mobiles) {
						System.out.println(m);
					}
					break;
				default:
					System.out.println("Invalid Input....");
				}
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Wrong id");
				}
				System.out.print("Do you want to agein (y/n) : ");
				ch = scan.next().charAt(0);
			
			} while (ch == 'y' || ch == 'Y');
		

	}

}
