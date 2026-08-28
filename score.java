/*
	menu driven program
	user can enter 2 numbers, either 1 or 0.
	if the user enters 1 then keep taking input from the user for a students marks(out of 100)
	if they enter 0 then stop
		marks >=90(good)
		89 >=marks >=60 (this is also good)
		59 >= marks >=0(this is good as well)
*/

import java.util.*;
class score
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int input;
		System.out.println("enter marks:");
	
		do{
			int marks=sc.nextInt();
			if(marks>=90 && marks<=100)
			{
				System.out.println("This is good");
			}
			else if(marks>=60 && marks<=89)
				{
					System.out.println("This is also Good");
				}
			else if(marks>=0 && marks<=59)
				{
					System.out.println("This is Good as well");
				}
			else
			{
				System.out.println("Invalid");
			}

			System.out.println("Want to continue (yes(1) or no(0))");
			input=sc.nextInt();
		}
		while(input==1);
	}
}
		