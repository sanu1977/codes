/* take an array as input from user,search for target x and print the index at which it occurs*/

import java.util.*;
class targetinx
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size:");
		int size=sc.nextInt();

		int [] numbers=new int[size];
		
		//input
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==x)
			{
				System.out.println("x found:"+i);
			}
		}
	}
}	