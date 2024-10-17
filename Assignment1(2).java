/*  
    NAME : Harsh Sankhe 
    UIN : 231P079
    ROLL NO : 29
    Assignment 1 Q2: Create a class Student with private attributes for name and age.
    Use a constructor to initialize these attributes and provide public getter
    methods to access them.
    In the main method, an instance of Student is created, and the student's
    details are printed.
*/
import java.util.*;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Assignment1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int age=in.nextInt();

        Student s1 = new Student(name, age);

        System.out.println("Student Name:"+s1.getName());
        System.out.println("Student Age:"+s1.getAge());

        in.close();
    }
}
