/* print inverted half pyramid(rotate by 180)
   *
  **
 ***
****

*/

import java.util.*;
class HalfPyramidRotate
{
	public static void main(String[]args)
	{
		int n=4;
		//outer loop
		for(int i=1;i<=n;i++)  
		{
			for(int j=1;j<=n-i;j++)  //inner loop-->space print
			{
				System.out.print(" ");
			}





			for(int j=1;j<=i;j++)   //inner loop-->star print
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}