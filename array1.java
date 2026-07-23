class array1
{	
	public static void main(String[]args)
	{
		int arr1[]={20,15,26,2,98,6};
		int arr2[]={2,6,15,20,26,98};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
			 	if(arr1[i]==arr2[j])
				{
					System.out.println(j+1);
				}
			}
		}
	}
}