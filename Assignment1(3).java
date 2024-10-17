/*  
    NAME : Harsh Sankhe 
    UIN : 231P079
    ROLL NO : 29
    Assignment 1 Q3: 
    Create a simple Java application that allows users to perform various
    string manipulation operations. The tool should provide a menu-driven
    interface where users can choose from the following functionalities:
    1. Reverse a String: Take a user-provided string and return it
    reversed.
    2. Check for Palindrome: Check if the provided string is a
    palindrome (reads the same forward and backward).
    3. Count Vowels and Consonants: Count the number of vowels
    and consonants in the given string.
    4. Convert to Uppercase and Lowercase: Convert the string to
    uppercase and lowercase.
    5. Find Substring: Check if a specific substring exists within the
    string.
*/
import java.util.*;

class StringManupulator {
    public String revreString(String str) {
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public boolean isPalindrome(String str) {
        int st=0, end=str.length()-1;

        while (st < end) {
            if(str.charAt(st) != str.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }

        return true;
    }

    public int countVowels(String str) {
        char ch, count=0;
        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public boolean isSubstring(String str, String subStr) {
        int idx=0, subidx=0;

        while (idx < str.length()) {
            if(str.charAt(idx) == subStr.charAt(subidx)) {
                if(subidx == subStr.length() - 1) {
                    return true;
                } else {
                    subidx++;
                    idx++;
                }
            } else {
                subidx = 0;
                idx++;
            }
        }

        return false;
    }
}

public class Assignment1Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        while (true) {
            System.out.println("---MENU---");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check for Palindrome");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Convert to Uppercase and Lowercase");
            System.out.println("5. Find Substring");
            System.out.println("6. Exit The Program");

            System.out.print("\nEnter Your Choice:");
            int choice = sc.nextInt();

            if(choice == 6) {
                break;
            } 

            System.out.print("Enter String To Perform Chosen Operation:");
            String str = sc.next();
            StringManupulator manupulate = new StringManupulator();

            switch (choice) {
                case 1:
                    str = manupulate.revreString(str);
                    System.out.println("Reversed String:"+str);
                    break;
                case 2:
                    if(manupulate.isPalindrome(str)) {
                        System.out.println(str+" is a palindrome");
                    } else {
                        System.out.println(str+" is not a palindrome");
                    }
                    break;
                case 3:
                    int vowels = manupulate.countVowels(str);
                    System.out.println("Vowel Count:"+vowels);
                    System.out.println("Consonant Count:"+(str.length()-vowels));
                    break;
                case 4:
                    str = str.toLowerCase();
                    System.out.println("LowerCase String:"+str);
                    break;
                case 5:
                    System.out.print("Enter Substring:");
                    String subStr = sc.next();
                    if(manupulate.isSubstring(str, subStr)) {
                        System.out.println(subStr+" is a substring of "+str);
                    } else {
                        System.out.println(subStr+" is not a substring of "+str);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
            System.out.println();
        }

        System.out.println("Thank You!");
        sc.close();
    }
}
