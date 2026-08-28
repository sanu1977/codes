/* make a function to check if a given number n is prime or not*/

import java.util.*;
class primefunc
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		printPrime(n);
		
	}

	public static void printPrime(int n)
	{       boolean isPrime = true;

		if(n<=1)
		{       
			
			System.out.println("This is neither prime nor composite");
			return;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
	
			if(isPrime)
			{
				System.out.println("This is a prime number");
			}
		
			else
			{
				System.out.println("This is not a prime number");
			}
		}
	}
}






	
	