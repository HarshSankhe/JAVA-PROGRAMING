/*  
    NAME : Harsh Sankhe 
    UIN : 231P079
    ROLL NO : 29
    Assignment 1 Q1: Write a Java program and compute the sum of an integer's digits.
*/
import java.util.Scanner;

public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}

