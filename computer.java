package akshithaj0;

public class computer {
	class processor
	{
		public void display()
		{
			System.out.println(" the brand is acer ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer c1 = new computer();
		computer.processor p1 = c1.new processor();
		p1.display();
	}

}
