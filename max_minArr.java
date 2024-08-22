package myPracticeProject;

public class max_minArr {
	public static void main(String args[])
	{
		int arr[] = {4,6,7,8,16,28,90,5,123};
		int max = arr[0],min = arr[0];
		for(int i = 0 ; i < arr.length; i++)
		{
			if (arr[i] < min )
			{
				min = arr[i];
			}
			if (arr[i] > max )
			{
				max = arr[i];
			}
		}
		System.out.println("MAX : "+ max + "  MIN : " + min);
	}

}
