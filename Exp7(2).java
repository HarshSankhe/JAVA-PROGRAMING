package skl_oop_java_B3;

/*
 *  Aim : Write a program to calculate volume of sphere using multilevel inheritance. The base class
method will accept the radius from user. A class will be derived from above mentioned class that
will have a method to find area of circle and another class derived from this will have methods to
calculate and display the volume of sphere. 
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.*;
public class SphereArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Volume obj = new Volume();
		obj.Accept_Radius();
		obj.calculate_area();
		obj.display();
		obj.calculate_volume();
		obj.display1();
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P043");
	}

}
class Radius{
	double r;
	double pi=3.142;
	Scanner sc = new Scanner(System.in);
	void Accept_Radius()
	{
	System.out.println("Enter a radius : ");
	r=sc.nextDouble();
	}
}
class calculateArea extends Radius{
	double area;
	void calculate_area()
	{
		area= pi*r*r;
		System.out.println("Area of the cirle of "+r+"is "+area);

	}
	void display() {
		System.out.println("Area of the cirle of "+r+"is "+area);
	}
}
class Volume extends calculateArea{
	double volume = 0;
	void calculate_volume() {
		volume = (4*pi*r*r*r/3);
	}
	void display1() {
		System.out.println("Volume of the Sphere of "+r+"is "+volume);
	}
}
