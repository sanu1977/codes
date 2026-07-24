/*A parking lot in a mall has R x C number of parking spaces.
Each parking space will either be empty (0) or full (1).
The status (0/1) of a parking space is represented as the element of the matrix.
The task is to find the index of the row (R) in the parking lot that has the maximum number of parking spaces full (1).
Note:R x C = Size of the matrix
Elements of the matrix M should be only 0 or 1
Input:
n=3
3 -> Value of R (row)
3 -> Value of C (column)
010
110
111
Output: 3
*/


class parking
{
	public static void main(String[]args)
	{
		int a[][]={{0,1,0},{1,1,0},{1,1,1}};
		int n=3;
		int gc=0;              //greatest sum value store
		int arr[]=new int[3];
		
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum +=a[i][j];
			}
				arr[i]=sum;
				if(sum>gc)
				{
					gc=sum;
				
				}
				

		}
		
	

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==gc)           //if two rows sums are same
			{	
				System.out.println(i+1);
			}
		}
	}
}