package git1;

public class Primeno {

	public static void main(String[] args) 
	{
	
		int n = 17  , count = 0;
		
		for(int i = 2;i<n; i+=1)
		{
			if(n % i == 0)
			{
				count+=1;
			}
		}
		if(count == 0)
		{
			System.out.println(n + " It is prime number");
		}
		
	}

}
