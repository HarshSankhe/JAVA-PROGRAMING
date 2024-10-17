package skl_oop_java_B3;

import java.util.*;

/*
 * Aim : WAP to display the month's name
 * Name : Harsh Sankhe
 * UIN: 231P079
 * Div : A
 */


public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
		System.out.println("Enter your choice");
		
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		switch (choice) 
		{
		case 1 :System.out.print("January\n");
				break;
				
		case 2: System.out.print("February\n");
				break;
				
		case 3 :System.out.print("March\n");
				break;
				
		case 4 :System.out.print("April\n");
				break;
				
		case 5 :System.out.print("May\n");
        		break;
        
		case 6 :System.out.print("June\n");
				break;
		
		case 7:System.out.println("July\n");
			   break;
		
        case 8 :System.out.print("August\n");
				break;
		
        case 9 :System.out.print("September\n");
        		break;
		
        case 10 :System.out.print("October\n");
        		 break;
     
        case 11 :System.out.print("November\n");
        		 break;

        case 12 :System.out.print("December\n");
        		 break;	
        		 
        default:System.out.println("Wrong choice");
        		System.out.println("Thank You ");	
        		System.out.println("Name : Harsh Sankhe");
        		System.out.println("UIN : 231P079");
		}
		}while(choice!=13);
	}

}
