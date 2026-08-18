/*print Floyd's triangle
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
*/

class Floyd
{
	public static void main(String[]args)
	{
		int n=5;
		int number=1;
		
		//outer loop
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)   //inner loop
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}