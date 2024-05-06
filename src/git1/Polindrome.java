package git1;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) 
	{
	
		//check pol
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int r = temp%10;
			
			sum = (sum*10)+r;
			temp = temp/10;
		}
		
		
		if(n==sum)
		{
		System.out.println("Polindrome");	
		}
		else
		{
			System.out.println("not pol");
		}
	}

}
