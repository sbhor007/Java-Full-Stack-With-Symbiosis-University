
public class WorkingWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 2;
		System.out.println("----for loop------");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " * " + no + " = " + (i*no));
		}
		
		int i = 1;
		System.out.println("----while loop------");
		while(i <= 10) {
			System.out.println(i + " * " + no + " = " + (i*no));
			i++;
		}
		
		System.out.println("----do...while loop------");
		i = 1;
		do {
			System.out.println(i + " * " + no + " = " + (i*no));
			i++;
		}while(i <= 10);

	}

}
