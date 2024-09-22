// addition of 2D Marix

//find the maximum and minimum of a given array

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Matrix {
	static void displayMatrix(int[][] matrix) {
		for(int row[] : matrix) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	static int[][] additionOfMatrix(int[][] matrix1,int[][] matrix2,int[][] result){
		for(int i = 0; i < matrix1.length;i++)
		{
			for(int j = 0 ; j < matrix1[i].length;j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,col;
		System.out.println("Enter the number of rows in matrix : ");
		row = scan.nextInt();
		System.out.println("Enter the number of columns in matrix : ");
		col = scan.nextInt();
		int[][] matrix1 = new int [row][col];
		int[][] matrix2 = new int [row][col];
		int[][] addition = new int [row][col];
		System.out.println("Enter the ( " + row + " * " + col + " ) MAtrix Elements of first matrix : ");
		
		for(int i = 0; i < matrix1.length;i++)
		{
			for(int j = 0; j < matrix1[i].length;j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		
System.out.println("Enter the ( " + row + " * " + col + " ) MAtrix Elements of Second matrix : ");
		
		for(int i = 0; i < matrix2.length;i++)
		{
			for(int j = 0; j < matrix2[i].length;j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(" First Matrix");
		displayMatrix(matrix1);
		
		System.out.println(" Second Matrix");
		displayMatrix(matrix2);
		
		System.out.println("Addition of Two Matrix is : ");
		addition = additionOfMatrix(matrix1, matrix2, addition);
		displayMatrix(addition);
		

	}

}
