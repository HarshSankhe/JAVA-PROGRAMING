package skl_oop_java_B3;

/*
 * Aim : Write a program in java to implement at least 5 methods of a string.
 * Name : Harsh Sankhe
 * UIN: 231P079
 * Div : A
 */

import java.util.*;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		
		int ch;
		
		String str = new String();
		
		String str1 = "JAVA PROGRAMMING";
		String str2 = " Is Fun";
		do {
		System.out.println("---MENU--- :");
		System.out.println("\n1.Lower case\n 2.Upper case\n 3.Length\n 4.Concate\n 5.Equals\n");
		System.out.println("Enter a Choice :");
		ch = sc.nextInt();

		switch(ch)
		{
		case 1 : System.out.println("New string is  :");
		         System.out.println(str1.toLowerCase());
			     break;
		case 2 : System.out.println("New string is  :");
				 System.out.println(str1.toUpperCase());
				 break;
		case 3 : System.out.println("New string is  :"); 
		         System.out.println(str1.length());
				 break;
		case 4 : System.out.println("New string is  :"); 
				 System.out.println(str1.concat(str2));
				 break;
		case 5 : System.out.println("New string is  :");
				 System.out.println(str1.equals(str2));
				 break;
	  default  : System.out.println("Wrong Choice!!!!:");

		}
	
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
		
	}while(ch!=0);
		
	}
	
		

}
