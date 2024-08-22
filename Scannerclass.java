package myPracticeProject;
import java.util.*;
class Student{
	String name;
	int rollno;
	String email;
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.email);
	}
}
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		s1.name = sc.next();
		s1.rollno = sc.nextInt();
		s1.email = sc.next();
		s1.display();
	}
}
