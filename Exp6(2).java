package skl_oop_java_B3;

/*
* Aim : Write a program in java to perform String Buffer functions.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str , rev;
		
		StringBuffer str1 = new StringBuffer();
		 
		 System.out.println("Enter a string: " );
		 str = sc.nextLine();
		 
		 str1.append(str);
		 str1.reverse();
		 rev = str1.toString();

		 if(str.equalsIgnoreCase(rev))
		 {
			 System.out.println("It is a palindrome" );
		 }

		 else
		 {
			 System.out.println("It is not a palindrome" );
		 }

		 System.out.println("Thank You ");
		 System.out.println("Name : Harsh Sankhe");
		 System.out.println("UIN : 231P079");
	}

}
