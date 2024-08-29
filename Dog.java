package akshithaj0;

public class Dog {
	String name,color;
	public Dog(String name1,String color1)
	{
		name = name1;
		color = color1;
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("shero","ab");
		System.out.println(d1.name);
		System.out.println(d1.color);

	}

}
