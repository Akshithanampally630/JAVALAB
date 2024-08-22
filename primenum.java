package myPracticeProject;

public class primenum {

	public static void main(String[] args) {
		int n = 24;
		int count = 0;
		for(int i = 2; i <n ; i++)
		{
			if (n%i == 0)
			{
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("the number is prime");
		}
		else 
		{
			System.out.println("number is not a prime number");
		}

	}
 
}
