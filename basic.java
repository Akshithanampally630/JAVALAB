package myPracticeProject;

class Animal{
	void display()
	{
		System.out.println("Animal is eating ");
	}
}
class Dog extends Animal{
	void display()
	{
		System.out.println("Dog is eating ");
	}
}
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myOb1 = new Animal();
		Dog myOb2 = new Dog();
		myOb1.display();
		myOb2.display();
		
	}

}
