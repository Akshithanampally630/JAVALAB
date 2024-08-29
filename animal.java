package akshithaj0;
class  Animal
{
	public void move()
	{
		System.out.println("moving");
	}
}
class Cheetah extends Animal
{
	public void move()
	{
		System.out.println("running");
	}
}
public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah c1 = new Cheetah();
		c1.move();
	}

}
