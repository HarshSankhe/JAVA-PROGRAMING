package skl_oop_java_B3;

/*
 *  Aim : Write a program to implement interface demonstrating the concept of multiple inheritance.
* Name : Harsh Sankhe
* UIN : 231P079
* Div : A.
*/

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results obj = new Results();
		obj.getrollNo(41);
		obj.PrintrollNo();
		obj.getMarks(9.3F,9.0F);
		obj.PrintMarks();
		obj.getSportsMarks();
		obj.display();
		System.out.println("\nThank You ");	
		System.out.println("Name : Harsh Sankhe ");
		System.out.println("UIN : 231P079");
	}

}

class StuDent{
	int rollNo;
	void getrollNo(int r) {
		rollNo = r;
	}
	void PrintrollNo() {
		System.out.println("Roll Number "+rollNo);
	}
}

class Marks extends StuDent{
	float part1;
	float part2;
	void getMarks(float a,float b) {
		part1 = a;
		part2 = b;
	}
	void PrintMarks() {
		System.out.println("Marks Part1:"+part1);
		System.out.println("Marks Part2:"+part2);
	}
}

interface Sports{
	float sportMarks =6.0F;
	void getSportsMarks();
}
class Results extends Marks implements Sports
{
	float total;
	public void getSportsMarks()
	{
		System.out.println("Sports Marks "+ sportMarks);
	}
	void display()
	{
		total=part1+part2+sportMarks;
		System.out.println("Total marks :"+total);
	}
	
}