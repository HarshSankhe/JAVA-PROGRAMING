package skl_oop_java_B3;

/*
* Aim : Write a program to calculate area of Rectangle and Circle using abstract class.
* Name :  Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class Area_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1 = new Rectangle();
		Circle obj2 = new Circle();
		obj1.area();
		obj2.area();
		System.out.println("\nThank You ");	
		System.out.println("Name :  Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
abstract class Shape{
	Scanner sc =new Scanner(System.in);
	abstract void area();
}

class Rectangle extends Shape{
	
	void area() {
		double area1;
		int lenght;
		int breath;
		System.out.println("Enter lenght:");
		lenght = sc.nextInt();
		System.out.println("Enter breath:");
		breath = sc.nextInt();
		area1 = lenght*breath;
		System.out.println("Area of rectangle is :"+area1);	
	}
}

class Circle extends Shape{
	void area() {
		double radius, area2;
		float pi = 3.142F;
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		area2 = pi*radius*radius;
		System.out.println("Area of circle is :"+area2);	
	}
}
