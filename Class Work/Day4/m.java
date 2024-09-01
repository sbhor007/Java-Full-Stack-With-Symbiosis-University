
import java.util.Scanner;

public class m {
	int num1,num2,choice;
	
	public m() {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		do{
			System.out.println(" 1]ADDITION\n"+" "+"2]SUBTRACTION\n"+" "+"3]MULTIPLICATION\n"+" "+"4]DIVISION\n5]EXIT\n"+" "+"SELECT YOUR CHOICE:");
			choice=sc.nextInt();
			switch(choice) {
		case 1:System.out.println("ENTER FIRST NUMBER:");
				num1=sc.nextInt();
				System.out.println("ENTER SECOND NUMBER:");
				num2=sc.nextInt();
				System.out.println("ADDITON:"+(num1+num2));
				break;
				
		case 2:System.out.println("ENTER FIRST NUMBER:");
				num1=sc.nextInt();
				System.out.println("ENTER SECOND NUMBER:");
				num2=sc.nextInt();
				System.out.println("SUBTRATION:"+(num1-num2));
				break;
				
		case 3:System.out.println("ENTER FIRST NUMBER:");
				num1=sc.nextInt();
				System.out.println("ENTER SECOND NUMBER:");
				num2=sc.nextInt();
				System.out.println("MULTIPLICATION:"+(num1*num2));
				break;
				
		case 4:System.out.println("ENTER FIRST NUMBER:");
				num1=sc.nextInt();
				System.out.println("ENTER SECOND NUMBER:");
				num2=sc.nextInt();
				System.out.println("DIVISION:"+(num1/num2));
				break;
		case 5:
			System.exit(0);
		default:System.out.println("INVALID CHOICE");
				break;
		
		}
	}while(choice != 5);

	}

	public static void main(String[] args) {
	
		m sc=new m();
		
	
	}
}