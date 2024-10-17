package skl_oop_java_B3;

import java.util.*;
/*
 * Aim : Write a program to create a class Account to perform the operation of insert, deposit and withdrawal of single
employee and make a use of object.
 * Name : Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int acc_no;
		String name;
		float amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter account number : ");
		acc_no=sc.nextInt();
		
		System.out.println("\n Enter Customer Name : ");
		name=sc.next();
		
		System.out.println("\n Enter Customer Account : ");
		amount=sc.nextFloat();
		
		AccountHelp obj1=new AccountHelp();
		obj1.insert(acc_no,name,amount);
		obj1.display();
		obj1.checkBalance();
		
		System.out.println("\n Enter Amount to be deposited");
		float dep_amount=sc.nextFloat();
		obj1.deposit(dep_amount);
		obj1.checkBalance();
		
		System.out.println("\n Enter Amount to be withdrawn");
		float wit_amount=sc.nextFloat();
		obj1.withdraw(wit_amount);
		obj1.checkBalance();
		System.out.println("\n Thank You");
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}

class AccountHelp
{
		int acc_no;
		String name;
		float amount;
		void insert(int a,String n,float amt)
		{
			acc_no=a;
			name=n;
			amount=amt;
			
		}
		
		void deposit(float amt)
		{
			amount=amount+amt;
			System.out.println(amt+"deposited");
		}
		
		
		void withdraw(float amt)
		{
			if(amount<amt)
			{
				System.out.println("Insufficient Balance");
			}
			else
			{
				amount=amount-amt;
				System.out.println(amt+"withdrawn");
			}
		}
		
		void display()
		{
			System.out.println("Account Number : "+acc_no);
			System.out.println("Customer Name : "+name);
			System.out.println("Customer Amount :"+amount);
		}
		
		
		void checkBalance()
		{
			System.out.println("Balance is : "+amount);
			
		}
		
	}

