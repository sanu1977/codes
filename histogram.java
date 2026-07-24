/*
 Given an array heights[] where each element represents the height of a histogram bar and the 
width of every bar is 1, find the largest rectangular area that can be formed inside the histogram.
Example
Input:
heights = [2,1,5,6,2,3]
Output:
10	
*/ 


class histogram
{
	 public static void main(String[]args)
	{ 
 		int height[]={2,1,5,6,2,3};
		int width=1;
 		int greater=0;
		int gi=0;
		int area=0;

		for(int i=0;i<height.length;i++)
		{
			if(height[i]>greater)
			{
				greater=height[i];
				gi=i;             //index of greater no store
			}
		}
		System.out.println(greater+" "+gi);
		
		int li=gi-1;
		int ri=gi+1;
		int l=height[li];
		int r=height[ri];
		
		System.out.println(l+" "+r); 
		if(l>r)
		{
			area=l*(width+(gi-li));
		}
		else
		{
			area=r*(width+(ri-gi));
		}
		System.out.println(area);
	
 	}
}