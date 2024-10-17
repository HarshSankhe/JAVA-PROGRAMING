package skl_oop_java_B3;

/*
 * Aim :Write an object oriented program to make a class called as circle. It should have three
methods namely: accept radius, calculate area and display area.
 * Name : Harsh Sankhe
 * UIN : 231P079
 * Div : A.
 */

import java.util.*;

public class Cicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float r;
		float area;
		double pi=3.142;
		
		CIRCLE obj3 = new CIRCLE();
		
		obj3.acceptRadius();
		
		obj3.calculateArea();
		
		obj3.diplay();
		
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");

	}

}

	class CIRCLE{
		
		float r;
		float area;
		double pi=3.142;
		
		Scanner sc = new Scanner(System.in);
		
		
		void acceptRadius()
		{
			System.out.println("Enter a radius : ");
			r=sc.nextFloat();
		}
		
		double calculateArea()
		{
			return pi*r*r;
		}
		
		
		void diplay()
		{
			System.out.println("The entered radius is : "+r);
			System.out.println("The value of the calculated area of the circle is : "+calculateArea());
		}
	}


