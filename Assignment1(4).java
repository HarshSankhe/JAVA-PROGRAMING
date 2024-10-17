/*  
    NAME : Harsh Sankhe 
    UIN : 231P079
    ROLL NO : 29
    Assignment 1 Q4: 
    Create a simple Java application that implements a stack data structure
    using an array. The stack should support the following operations:
    1. Push: Add an element to the top of the stack.
    2. Pop: Remove and return the top element from the stack.
    3. Peek: Return the top element without removing it.
    4. isEmpty: Check if the stack is empty.
    5. Display: Show all elements in the stack.
    The application should provide a menu-driven interface to allow users
    to interact with the stack.
*/
import java.util.*;

public class AssignmentQ4 {
    static int stack[];
    static int top=-1;
    static int MAX = 10;
    
    public static void push(int value) {
        stack[++top] = value;
    }

    public static int pop() {
        if(isEmpty()) {
            System.out.println("Cannot Pop From Empty Stack");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static int peek() {
        return stack[top];
    }    

    public static void display() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Stack:");
            for(int i=top-1; i>=0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize stack size
        System.out.println("Enter the size of the stack:");
        stack = new int[MAX];

        // Menu-driven loop
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Push
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    push(value);
                    break;
                case 2: // Pop
                    int poppedValue = pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3: // Peek
                    int topValue = peek();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;
                case 4: // isEmpty
                    if (isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5: // Display
                    display();
                    break;
                case 6: // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 6);

        sc.close();
    }
}