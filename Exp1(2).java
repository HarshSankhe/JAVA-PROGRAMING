package skl_oop_java_B3;

/*
Aim: WAP to display arithemetic operation with characters 
NAME : Harsh Sankhe
UIN:   231P079
DIV:A
*/

import java.util.Scanner;

public class Char_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char ch;
		int x,y;
		Scanner sc=new Scanner (System.in);
		
		
		do {
			
			
			System.out.println("Menu");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divison");
			System.out.println("5. Mod");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case '+': System.out.println("1. Addition");
					System.out.println("Enter the first number:");
					x = sc.nextInt();
					System.out.println("Enter the second number:");
					y = sc.nextInt();
			
					System.out.println("x+y:"+(x+y));
					break;
					
			case '-': System.out.println("2. Substraction");
			  		System.out.println("Enter the first number:");
			  		x = sc.nextInt();
			  		System.out.println("Enter the second number:");
			  		y = sc.nextInt();

			  		System.out.println("x-y:"+(x-y));
			  		break;
			  		
			  		
			case '*': System.out.println("3. Multiplication");
					System.out.println("Enter the first number:");
					x = sc.nextInt();
					System.out.println("Enter the second number:");
					y = sc.nextInt();
	
					System.out.println("x*y:"+(x*y));
					break;
					
			case '/': System.out.println("4. Division");
			 		System.out.println("Enter the first number:");
			 		x = sc.nextInt();
			 		System.out.println("Enter the second number:");
			 		y = sc.nextInt();

			 		System.out.println("x/y:"+(x/y));
			 		break;

			 		
			case '%': System.out.println("5. Mod");
					System.out.println("Enter the first number:");
					x = sc.nextInt();
					System.out.println("Enter the second number:");
					y = sc.nextInt();

					System.out.println("x%y:"+(x%y));
					break;
					
			case '&': System.out.println("Thank You");
					System.exit(0);
					
					default :   System.out.println("Wrong choice");
								System.out.println("Thank You ");
								System.out.println("Name : Harsh Sankhe");
								System.out.println("UIN : 231P079");
			}
		}while(ch!=6);
		
	}

}
