package akshithaj0;
class  Animal2
{
	public void move()
	{
		System.out.println("moving");
	}
}
class Cheetah1 extends Animal2
{
	public void move()
	{
		System.out.println("running");
	}
}
public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah c1 = new Cheetah();
		c1.move();
	}

}
