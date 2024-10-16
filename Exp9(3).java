package skl_oop_java_B3;

/*
* Aim : Write a program to display volume of sphere and Hemisphere. Make use of abstract class.
* Name : Harsh Sankhe 
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class Rectangle_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangleArea obj1 = new rectangleArea();
		Square obj2 = new Square();
		obj1.area();
		obj2.area();

		System.out.println("\nThank You ");	
		System.out.println("Name :  Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
abstract class Figure{
	Scanner sc =new Scanner(System.in);
	abstract void area();
}

class rectangleArea extends Figure{
	
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

class Square extends Figure{
	void area() {
		int side;
		double area;
		System.out.println("Enter side of the square:");
		side = sc.nextInt();
		area = side*side;
		System.out.println("Area of square is :"+area);	
	}
}
