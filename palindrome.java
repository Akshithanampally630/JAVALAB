package myPracticeProject;

public class palindrome {
	public static void main(String args[])
	{
		int n = 6764,rev = 0,r;
		int t = n;
		while(t > 0)
		{
			r = t%10;
			rev = rev*10 + r;
			t = t/10;
		}
		if (rev == n)
		{
			System.out.println("number is a palindrome");
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
	}

}
