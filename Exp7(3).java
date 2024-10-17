package hi;

/*
 *  Aim : Write a program to calculate volume of sphere using multilevel inheritance demonstrating method
overriding. The base class method will accept the radius from user. A class will be derived from
above mentioned class that will have a method to find area of circle and another class derived
from this will have methods to calculate and display the volume of sphere
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.*;

public class SphereAreaOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume obj = new volume();
		obj.Accept_Radius();
		obj.calculate_area();
		obj.calculate_volume();
		obj.display();
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
class radius{
	double r;
	double pi=3.142;
	Scanner sc = new Scanner(System.in);
	void Accept_Radius()
	{
	System.out.println("Enter a radius : ");
	r=sc.nextDouble();
	}
}
class AreaCalculate extends radius{
	double area;
	void calculate_area()
	{
		area= pi*r*r;
	}
	void display() {
		System.out.println("Area of the cirle of "+r+"is "+area);
	}
}
class volume extends AreaCalculate{
	double volume = 0;
	void calculate_volume() {
		volume = (4*pi*r*r*r/3);
	}
	void display() {
		super.display();
		System.out.println("Volume of the Sphere of "+r+"is "+volume);
	}
}

