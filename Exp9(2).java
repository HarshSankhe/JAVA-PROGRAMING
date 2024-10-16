package skl_oop_java_B3;

/*
* Aim : Write a program to display volume of sphere and Hemisphere. Make use of abstract class.
* Name :  Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

import java.util.Scanner;

public class Sphere_Hemisphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sphere obj1 = new Sphere();
		Hemisphere obj2 = new Hemisphere();
		obj1.volume();
		obj2.volume();
		System.out.println("\nThank You ");	
		System.out.println("Name :  Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
abstract class ShapeVolume{
	Scanner sc =new Scanner(System.in);
	abstract void volume();
}

class Sphere extends ShapeVolume{
	void volume() {
		double radius, volume1;
		float pi = 3.142F;
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		volume1 = (4*pi*radius*radius*radius/3);
		System.out.println("Volume of Sphere is :"+volume1);	
	}
}

class Hemisphere extends ShapeVolume{
	
	void volume() {
		double radius, volume2;
		float pi = 3.142F;
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		volume2 = (2*pi*radius*radius*radius/3);
		System.out.println("Volume of Hemisphere is :"+volume2);	
	}
}
