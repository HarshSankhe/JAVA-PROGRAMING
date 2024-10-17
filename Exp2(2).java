package skl_oop_java_B3;

/*
 * Aim : WAP to display the pattern
 * Name:Harsh Sankhe
 * UIN : 231P079
 * Div : A
 */

public class Labeltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stop: { 
			nextRow: 
			for(int row=1;row<=7;row++) 
			   { 
			   if (row==6) 
			   break stop; 
			   System.out.println(); 
			   for(int column=1;column<=10;column++) 
			      { 
			      if(column>row) 
			      continue nextRow; 
			      System.out.print(" * "); 
			        } 
			            } 
		
		}
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");
	}

}
