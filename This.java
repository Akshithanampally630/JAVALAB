package myPracticeProject;

import java.util.*;

class Student1
{
	String name;
	int age;
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Scanner sc = new Scanner(System.in);
		s1.name = sc.next();
		s1.age = sc.nextInt();
		s1.display();
	}

}
