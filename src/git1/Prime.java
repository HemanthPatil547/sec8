package git1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
	// Prime no less than N
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a range of prime no");
		int n = sc.nextInt();
		sc.close();
		
		int i = 1;
		int count =0;
		while(i<=n)
		{
			for(int j =2;j<i;j++) 
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==0) 
			{
				System.out.print(i+",");
			}
			count=0;
			i++;
		}
	}

}
