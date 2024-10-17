package skl_oop_java_B3;

/*
 * Aim : WAP to display the pattern using for loop
 * Nmae : Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

import java.util.*;

public class Pattern_ForLOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		//Input from user
		int i,j,n;
		System.out.println("Enter number of rows&coloumn :");
		n = sc.nextInt();
	
	//Logic

	//for loop for row
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
		
				System.out.println();
			}
	
			System.out.println("Thank You ");	
			System.out.println("Name : Harsh Sankhe");
			System.out.println("UIN : 231P079");
	
}

	}


