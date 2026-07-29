/*Q1.Given an array of integers where every element appears even number of times except one element which appears odd number of times, write a program to find that odd occurring element in O(log n) time. The equal elements must appear in pairs in the array but there cannot be more than two consecutive occurrences of an element.
Sample Input :
Array Size:5
2 2 3 1 1
Sample Output : 3
Sample Input :
Array Size:3
2 3 2
It doesn't have equal elements appear in pairs
Sample Input :
Array Size:7
1 1 2 2 2 3 3
It contains three consecutive instances of an element*/

class consecutiveOccurrence{
	public static void main(String args[]){
		int arr[]={2,2,3,3,3,2,2};
		int n=0;
		int c=1;
		int p=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1])
			{
				c++;
			}
			
			else{
				if(c%2!=0)
				{
					if(c==3)
					{
						System.out.println("3 consecutive instances");
					}
					else{
						System.out.println(arr[i]);
					}
				}
				else
				{
					p=c+p;
					//System.out.println("No consecutive pair");
				}
			c=1;
			}
			
			
		}
		if (c % 2 != 0) {
            		System.out.println(arr[arr.length - 1]);
        	}
		if(p>1)
		{
			
		}
		else{
			System.out.println("No consecutive pair");
		}
	}
}

		
		