/* print hollow rectangle
   * * * * *
   *       *
   *       *
   * * * * *
*/

import java.util.*;
class HollowRectangle
{
	public static void main(String[]args)
	{
		int n=4;  //rows
		int m=5; //colums
   
		for(int i=1;i<=n;i++) //outer loop
		{
			for(int j=1;j<=m;j++)  //inner loop
			{
				//cell ->(i,j)
				if(i==1 || j==1 || i==n ||j==m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}