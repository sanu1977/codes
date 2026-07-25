/*element sort test1
Airport security officials have confiscated several item of the passengers at the security check point. 
All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk [0,1,2]. 
Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items
 based on their levels of risk in the array. The risk values range from 0 to 2.

Example:
Input:
7 -> Value of N
[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output:
0001122 -> Element after sorting based on risk severity
0-Low risk
1-Medium risk
2-High risk

*/

class sorting
{
	public static void main(String[]args)
	{
		int arr[]={1,0,2,0,1,0,2};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
			