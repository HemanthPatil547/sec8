package git1;

import java.util.Scanner;

public class Armstrng {

	public static void main(String[] args) 
	{
		 int n , temp  , sum = 0 , dig = 0 ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Armstrong No");
		 n = sc.nextInt();
		 sc.close();
		 
		 temp=n;
		
		 //count digits in n
		 while(temp>0)
		 {
			 temp = temp/10;
			 dig++;
			 
		 }
		 System.out.println("digit in a Number :"+dig);
	
		temp = n ;
		while(temp>0)
		{
			int last = temp%10;
			sum = (int) (sum + (Math.pow(last, dig)));
			temp = temp/10;
		}
		 
		if(n==sum)
		{
			System.out.println("Arm ");
		}
		else {
			 System.out.println("Not a Arm");
		}
	}

}
