package skl_oop_java_B3;

/*
* Aim : Write a program for replace method of StringBuffer class.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.*;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer("Tasneem  Shaikh");
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter a string: "+str );

		 StringBuffer s= str.replace(8, 8, "Azharul");
		
		 System.out.println("New string is: "+s );

		 System.out.println("Thank You ");
		 System.out.println("Name : Harsh Sankhe");
		 System.out.println("UIN : 231P079");

	}

}
