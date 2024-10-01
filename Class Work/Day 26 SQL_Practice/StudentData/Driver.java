package StudentData;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			try {
				System.out.print(
						"1. Insert Data\n2. Find maximum Marks\n3. find minimum marks\n4. Show Student Data\n5. Delet Record\n6. Update student record\nEnter Your Choice : ");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					char c;
					do {
						try {
							System.out.print("Enter Student Name : ");
							String studeName = scan.next();
							System.out.print("Enter Student marks : ");
							int marks = scan.nextInt();
							Student.insert(studeName, marks);
						} catch (Exception e) {
							System.out.println(e.getMessage());
							scan.next();
						}
						System.out.print("To Store Another record (y/n) : ");
						c = scan.next().toUpperCase().charAt(0);
					} while (c == 'Y');
					break;
				case 2:
					System.out.println("Maximum Marks : " + Student.maxMarks());
					break;
				case 3:
					System.out.println("Minimum Marks : " + Student.minMarks());
					break;
				case 4: 
					Student.showData();
					break;
				case 5:
					System.out.print("Enter Student Id : ");
					int studId = scan.nextInt();
					Student.deleteRecord(studId);
					break;
				case 6:
					System.out.print("Enter Student Name : ");
					String studName = scan.next();
					System.out.print("Enter Student Id : ");
					studId = scan.nextInt();
					Student.updateRecord(studName, studId);
					break;
				default:
					System.out.println("Invalid Input");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.next();
			}
			System.out.print("Go for Main Mainu (y/n) : ");
			ch = scan.next().toUpperCase().charAt(0);
		} while (ch == 'Y');
		

	}

}
