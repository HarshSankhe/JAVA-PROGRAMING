package skl_oop_java_B3;

/*
 * Aim : Write a program to implement single and multilevel inheritance using super
keyword.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A
 */
import java.util.*;
public class Single_Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acc_details A = new Acc_details("Harsh Sankhe",801,500,1000,2000,200);
		Online ol = new Online("Harsh Sankhe",801);
		A.display();
		ol.display();
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
class Account{
	String cust_name;
	int acc_no;
	 Account() {}	
	 Account(String a, int b){
		cust_name=a;
		acc_no=b;
	}

	void display() {
		System.out.println("Customer name : "+cust_name);
		System.out.println("Account No : "+acc_no);
	}
}

class Online extends Account{
	Online(String a, int b)
	{
		super(a,b);	
	}
	void display() {
		System.out.println("Customer Id : "+(cust_name+acc_no%10));
		System.out.println("Account No : "+acc_no/10+8);
	}
}

class Saving_acc extends Account{
	int min_bal;
	int saving_bal ;		
	Saving_acc(String a, int b, int c, int d ){
		super(a,b);
		min_bal = c;
		saving_bal = d;
	}
	void display(){
		super.display();
		System.out.println("Mininum Balanace : "+min_bal);
		System.out.println("Saving Balance : "+saving_bal);
	}
}
class Acc_details extends Saving_acc{
	int deposits;
	int withdraw;
	Acc_details(String a, int b, int c, int d, int e, int f){
		super(a,b,c,d);
		 deposits = e;
		 withdraw = f;
	}
	void display(){
		super.display();
		System.out.println("Deposits : "+deposits);
		System.out.println("Withdrawal : "+withdraw);
	}
}
