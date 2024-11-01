package Ass24;

import java.util.Scanner;

//Search Number from Given 2D Matrix
public class SearchElement {
	
	static int[] search(int matrix[][],int key) {
		int positions[] = new int[] {-1,-1};
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				if(matrix[i][j] == key) {
					positions[0] = i;
					positions[1] = j;
					return positions;
				}
			}
		}
		return positions;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter Number of rows and colums in a Matrix : ");
			int rows = scan.nextInt();
			int cols = scan.nextInt();
			int matrix[][] = new int[rows][cols];
			System.out.println("Enter The Matrix Elements : ");
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols;j++) {
					matrix[i][j] = scan.nextInt();
				}
			}
			for(int row[] : matrix) {
				for(int col : row) {
					System.out.print(col + "\t");
				}
				System.out.println();
			}
			System.out.print("Enter The Element to search : ");
			int key = scan.nextInt();
			int positions[] = search(matrix, key);
			if(positions[0] == -1) {
				System.out.println("Element not found");
			}else {
				System.out.print(key + " present at [");
				for(int i : positions) {
					System.out.print(i + " , ");
				}
				System.out.print("] index");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
