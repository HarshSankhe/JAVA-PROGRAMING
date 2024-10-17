package skl_oop_java_B3;

/*Aim: WAP to display arithemetic operation
NAME : Harsh Sankhe
UIN:   231P079
Div : A
 */

import java.util.*;

public class Arthematic_Operation_B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, x, y;
		Scanner sc=new Scanner(System.in);
		do {
			
		
		System.out.println("Menu");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		System.out.println("5. Mod");
		System.out.println("6. Exit");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("1. Addition");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
		
				System.out.println("x+y:"+(x+y));
				break;
		
				
		case 2: System.out.println("2. Substraction");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();

				System.out.println("x-y:"+(x-y));
				break;
				
		case 3: System.out.println("3. Multiplication");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();
		
				System.out.println("x*y:"+(x*y));
				break;
				
		case 4: System.out.println("4. Division");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();

				System.out.println("x/y:"+(x/y));
				break;
		
		case 5: System.out.println("5. Mod");
				System.out.println("Enter the first number:");
				x = sc.nextInt();
				System.out.println("Enter the second number:");
				y = sc.nextInt();

				System.out.println("x%y:"+(x%y));
				break;
		
		
		
		case 6: System.out.println("Thank You");
				System.exit(0);
				
		default :   System.out.println("Wrong choice");
					System.out.println("Thank You ");
					System.out.println("Name : Harsh Sankhe");
					System.out.println("UIN : 231P079");
		}
		}while(choice!=6);


	}

}
