package skl_oop_java_B3;

/*
 * Aim : 
 * Name : Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

import java.util.*;

public class FindAreaOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner (System.in);
		
		
		double r1;
		int r2;
		
		AreaOfMethodOverload obj1=new AreaOfMethodOverload();
		obj1.areaCircle();
		
	
		System.out.println("Enter Radius 01 : ");
		r1 = sc.nextDouble();
		AreaOfMethodOverload obj2=new AreaOfMethodOverload();
		obj2.areaCircle(r1);
		
		System.out.println("Enter Radius 02 : ");
		r2 = sc.nextInt();
		AreaOfMethodOverload obj3=new AreaOfMethodOverload();
		obj3.areaCircle(r2);
		
		System.out.println("Area of the circle -------Radius =5 :  ");
		obj1.display();

		System.out.println("Area of the circle -------Radius  :" +r1 );
		obj2.display();
		
		System.out.println("Area of the circle -------Radius  : "+r2 );
		obj3.display();
		
		System.out.println("Name : Harsh Sankhe" );
		System.out.println("UIN : 231P079" );
	}

}

class AreaOfMethodOverload
{
	double r;
	void areaCircle()
	{
		r=5;
		
	}
	
	void areaCircle(double radious)
	{
	r=radious;
	}
	
	void areaCircle(int radious)
	{
	r=radious;
	}
	
	void display( )
	{ 
		System.out.println(" Area of Circle : "+(3.14*r*r));
	}
	
	}
	