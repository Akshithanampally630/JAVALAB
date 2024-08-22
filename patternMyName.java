package myPracticeProject;

public class patternMyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for(int i = 1 ; i <= n/2 ; i++)
		{
			for(int j = 1 ; j <= n ; j++)
			{
				if(i<=n/2)
				{
					if(j == (n-i)+1)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			
			}
			System.out.println();
		}
	}

}
