package myPracticeProject;

public class factorial {
	public static void main(String args[]) 
	{
		int n = 6,i,fact= 1;
		for(i = n ; i > 0 ; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
