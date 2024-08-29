package akshithaj0;
class Animal3
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void sound()
	{
		System.out.println("Animal is making sounds ");
	}
	
}
class Lion extends Animal3
{
	void eat()
	{
		System.out.println("Lion is eating");
	}
	void sound()
	{
		System.out.println("lion roar");
	}
}
class Tiger extends Animal3
{
	void eat()
	{
		System.out.println("tiger is eating");
	}
	void sound()
	{
		System.out.println("tiger roar");
	}
}
class panther extends Animal3
{
	void eat()
	{
		System.out.println("panther is eating");
	}
	void sound()
	{
		System.out.println("panther roar");
	}
}
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l1 = new Lion();
		Tiger t1 = new Tiger();
		panther p1 = new panther();
		l1.eat();
		l1.sound();
		t1.eat();
		t1.sound();
		p1.eat();
		p1.sound();
	}

}
