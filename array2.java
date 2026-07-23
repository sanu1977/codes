class array2
{
	public static void main(String[]args)
	{
		int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
		int result[]=new int[arr.length];
		int j=0;
	
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				result[j]=arr[i];
				j++;
			}
		}
			
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				result[j]=arr[i];
				j++;
			}
		}
			
		
                for(int i=0;i<result.length-1;i++)
		{
			System.out.println(result[i]);
		}
	}
}
