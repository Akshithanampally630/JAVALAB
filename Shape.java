package akshithaj0;

class shape1
{
	void getArea()
	{
		System.out.println(" method in parent class shape ");
	}
}
 class rectangle extends shape1
{
	void getArea()
	{
		System.out.println("method in child class rectangle ");
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle();
		r1.getArea();
	}

}
