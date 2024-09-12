package ExceptionHandling;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,10,22,14,33};
		
		for(int i = 0; i < arr.length;i++)
		{
			try {
				int result = arr[i]/0;
				System.out.println("Ans : " + result);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
