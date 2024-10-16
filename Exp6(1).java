package skl_oop_java_B3;

/*
 *  Aim : Write a program to implement a Vector that accepts five items from the command line and store them
in a Vector and display the objects stored in a Vector. 
* Name : Harsh Sankhe 
* UIN : 231P079
* Div : A.
*/

import java.util.*;

public class ShoppingItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector list = new Vector();
		
		int len=args.length;
		
		for(int i=0;i<len;i++)
		{
		list.addElement(args[i]);
		}
		
		int size=list.size();
		
		String str[]= new String[size];
		
		list.copyInto(str);
		
		for(int i=0;i<size;i++)
		{
		System.out.println ("Element of Vector at position "+i+":"+str[i]);
		}

			     System.out.println("Thank You ");

				System.out.println("Name : Harsh Sankhe");
				System.out.println("UIN : 231P079");

	}

}
