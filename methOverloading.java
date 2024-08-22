package myPracticeProject;
class method{
	public  void print()
	{
		System.out.println("MY NAME IS AKSHITHA");
	}
	public  void print(String name)
	{
		System.out.println("MY NAME IS "+name);
	}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a, int b ,int c)
	{
		return a+b+c;
	}
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public void multiply(double a , double b)
	{
		System.out.println(a*b);
	}
}
public class methOverloading {

	public static void main(String[] args) {
		method m = new method();
		m.print();
		m.print("AKSHITHA");
		System.out.println(m.sum(6,7));
		System.out.println(m.sum(1,2,3));
		m.multiply(1,2);
		m.multiply(2.5,2.5);
	}

}
