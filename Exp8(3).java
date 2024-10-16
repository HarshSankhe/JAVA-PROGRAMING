package skl_oop_java_B3;

/*
* Aim : Implement above interface using suitable java class program and also develop the main program.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class InterfaceMatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All obj = new All();
		
		obj.readMatrix();
		obj.displayMatrix();
		obj.sum_Diagonal_Matrix();
		obj.Display_sum_Diagonal_Matrix();
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
interface Matrix2
{
	final static int M=5, N=5;
	void readMatrix();
	void displayMatrix();
	void sum_Diagonal_Matrix();
	void Display_sum_Diagonal_Matrix();
}

class All implements Matrix2{
	Scanner sc =new Scanner(System.in);
	int set1 [][] = new int[5][5];
	int add [][] = new int [5][5];
	int i,j,d1=0,d2=0;
	
	
	public void readMatrix() {
		System.out.println("Enter your first 5x5 matrix:");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				set1[i][j] = sc.nextInt();
			}		
		}
	}
	public void displayMatrix() {
			System.out.println("First 5x5 matrix:");
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					System.out.print(set1[i][j]+"\t");
				}		
				System.out.println(" ");
			}
	}
	public void sum_Diagonal_Matrix() {
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i==j) {
					d1=d1+set1[i][j];
				}
			}
		}
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i==j) {
					d2=d2+set1[i][j];
				}
			}
		}
	}
	
	public void Display_sum_Diagonal_Matrix() {
		System.out.println("The sum of first diagonal is : "+d1);
		System.out.println("The sum of second diagonal is : "+d2);
	}
	
}