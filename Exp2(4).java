package skl_oop_java_B3;

/*
 * Aim : WAP to display number 1 to 5
 * Name: Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

import java.util.*;

public class Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of rows&coloumn :");
		n = sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
