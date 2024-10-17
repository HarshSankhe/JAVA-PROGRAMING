package skl_b3;

/*
 * Aim : Write a program in java to count frequency of a given letter in a String.
 * Name : Harsh Sankhe
 * UIN : 231P079
 * Div : A.
 */

import java.util.*;



public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='a';
		int len, count=0;
		
		String str = new String();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String :");
		str = sc.nextLine();
		
		System.out.println(" String is : "+str);
		
		System.out.println("Enter a character to search to compare :");
		ch = sc.next().charAt(0);
		
		len = str.length();
		
		for(int i = 0; i<=len-1; i++)
			
		if(ch==str.charAt(i))
		{
			count++;
		}
		System.out.println("Frequency of character"+ch+"in string is "+count);
		
		System.out.println("Thank You ");
		
		System.out.println("Name : Harsh Sankhe");
		System.out.println("UIN : 231P079");

	}

}


