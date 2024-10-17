package skl_oop_java_B3;

/*
 *  Aim : WAP to display number 1 to 10 numbers except 5
 * Name: Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

import java.util.Scanner;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n :");
		
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
