package skl_oop_java_B3;

/*
* Aim : Implement above interface using suitable java class program and also develop the main program.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class InterfaceMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Everything obj = new Everything();
		obj.readMatrix();
		obj.displayMatrix();
		obj.addMatrix();
		obj.DisplayAddMatrix();
		System.out.println("\nThank You ");	
		System.out.println("Name :Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
interface Matrix
	{
	final static int M=5, N=5;
	void readMatrix();
	void displayMatrix();
	void addMatrix();
	void DisplayAddMatrix();
	}
class Everything implements Matrix{
	Scanner sc =new Scanner(System.in);
	int set1 [][] = new int[5][5];
	int set2 [][] = new int[5][5];
	int add [][] = new int [5][5];
	int i,j;
	public void readMatrix() {
		System.out.println("Enter your first 5x5 matrix:");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				set1[i][j] = sc.nextInt();
			}		
		}
		System.out.println("Enter your second 5x5 matrix:");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				set2[i][j] = sc.nextInt();
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
			System.out.println("Second 5x5 matrix:");
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					System.out.print(set2[i][j]+"\t");
				}		
				System.out.println(" ");
			}
			
	}
	public void addMatrix() {
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				add[i][j] = set1[i][j]+set2[i][j];
			}		
		}
	}
	public void DisplayAddMatrix() {
		System.out.println("Addition 5x5 matrix:");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(add[i][j]+"\t");
			}	
			System.out.println(" ");
		}
}
}