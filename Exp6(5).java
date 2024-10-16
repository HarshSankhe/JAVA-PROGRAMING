package skl_oop_java_B3;

/*
* Aim : Write a program that accepts a shopping list of items and perform the following operations: Add
an item at specified location, delete an item in the list, and print the content of vector.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.*;

public class VectorShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		v.addElement(" Bread ");
		v.addElement(" Butter ");
		v.addElement(" Milk ");
		v.addElement(" Pulses ");
		v.addElement(" Chocolates ");

		System.out.println(" Elements of the Vector are :");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.elementAt(i)+ "\n");
		}
		
		System.out.println("\n Size of the vector now is :"+v.size());

		v.insertElementAt(" Vegetables" ,0);
		v.insertElementAt(" Fruits" ,4);
		
		
		System.out.println(" Elements of the Vectorafter insertion are :");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.elementAt(i)+ "\n");
		}
		System.out.println("\n Size of the vector now is :"+v.size());

		v.removeElement(" Pulses ");

		System.out.println(" " );
		System.out.println(" " );

	
		System.out.println(" Elements of the Vector after deletion are :" );
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.elementAt(i)+ "\n");
		}
		
		System.out.println(" \nSize of the new vector is :"+v.size());

		 System.out.println("Thank You ");

			System.out.println("Name : Harsh Sankhe");
			System.out.println("UIN : 231P079");

	}

}
