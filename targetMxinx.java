/*take a matrix as input from the user .search for a 
given number X and print index of that 'x' number*/

import java.util.*;
class targetMxinx
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		System.out.println("Enter cols:");
		int cols=sc.nextInt();
		
		int [][] numbers=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter target element:");	
		int x=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(numbers[i][j]==x)
				{
					System.out.println("x found at index:"+ numbers[i][j]);
				}
			}
			System.out.println();
		}
	}
}