package skl_oop_java_B3;

/*
 * Aim : Write a program to add integer number and string using method overloading.
 * Name : Harsh Sankhe 
 * UIN : 231P079
 * Div : A.
 */

public class AddStringAndInteger {

	
	public static void main(String[] args) {
    StrInt obj = new StrInt();

  
    int sum = obj.add(5, 10);
    System.out.println("Sum of integers: " + sum);

 
    String concatenatedString = obj.add("Hello, ", "World!");
    System.out.println("Concatenated String: " + concatenatedString);
    
    System.out.println("Thank You ");
	
	System.out.println("Name : Harsh Sankhe");
	System.out.println("UIN : 231P079");
	
    
	}
		}


	class StrInt
	{

		public int add(int a, int b)
		{
			return a + b;
		}
		
		
	public String add(String a, String b) 
	{
		return a + b;
	}
	
	}