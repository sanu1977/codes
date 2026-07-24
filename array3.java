/*Given a integer array nums of size n,return the majority element of the array.
 the majority element of an array is an element that appears more than n/2
 times in the array.the array is guaranteed to have a majority element
*/




class  array3
{
	public static void main(String[]args)
	{
		int num[]={7,0,0,1,7,7,2,7,7};
	
		int gc=0;
		int element=0;

		for(int i=0;i<num.length;i++)
		{
			int c=0;
			for(int j=0;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					c++;
				}
			}
			if(c>gc)
			{
					gc=c;
					element=num[i];

			}
		}
		System.out.println(element);
	}
}		