/*Problem Statement:
Given an array of size N-1 containing distinct integers in the range [1, N], 
find the missing number from the first N natural numbers.
Example:
Input:
1235
Output: 4
*/





class missing
{
	public static void main(String[]args)
	{
	int[]arr={1,2,3,5};
	
 
        /*for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i+1]-arr[i]!=1)
		{
  			System.out.println(arr[i]+1);
		}
	}*/

	int count=1;
	for(int i=0;i<arr.length;i++)
	{
		if(count!=arr[i]){
			System.out.println(count);
		}
		count++;
	}
}
}		
		