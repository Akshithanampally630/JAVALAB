package myPracticeProject;

class Animal1{
	void display()
	{
		System.out.println("Animal is eating ");
	}
}
class Dog1 extends Animal1{
	void display()
	{
		System.out.println("Dog is eating ");
	}
}
public class methOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 myOb1 = new Animal1();
		Dog1 myOb2 = new Dog1();
		myOb1.display();
		myOb2.display();
		
	}

}
