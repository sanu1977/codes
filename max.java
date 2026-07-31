/*
Amazon is preparing for its annual shopping festival and wants to identify its top-performing products.

Given the sales count of different products, find the Kth best-selling product.

The Kth best-selling product is the product whose sales rank is exactly K when all products are sorted in descending order of sales.

Input Format

First line contains two integers N and K.

Second line contains N integers representing the sales count of each product.

Output Format

Print the Kth best-selling product's sales count.

Constraints

1<K≤ N ≤ 105

Sales count is a positive integer.

Example 1

Input

6 3

50 20 70 40 90 60

Output

60

Explanation

Sorted in descending order:

90 70 60 50 40 20

The 3rd best-selling product has 60 sales.

Example 2

Input

5 2
15 25 10 40 30

Output

30
*/

class max{
	public static void main(String args[])
	{
		int arr[]={50,20,70,40,90,60};
		//int arr[]={15,25,10,40,30};
		int k=3;

		int e=k-1;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}
		}
				System.out.println(arr[e]);
	}
			
}