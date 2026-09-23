/*Problem Statement

Andy wants to go on a vacation to de-stress himself. He can take only one continuous vacation during the next N days, where the days are numbered from 1 to N.

Andy already has M obligations scheduled on specific days. The i-th obligation is on day D[i]. To extend his vacation, Andy is allowed to cancel at most K obligations.

Your task is to determine the maximum number of consecutive vacation days Andy can take after canceling at most K obligations. I

Input Format

The first line contains three integers:

N-Total number of days.

M-Number of scheduled obligations.

K-Maximum number of obligations that can be canceled.

The second line contains M space-separated integers representing the days on which the obligations are scheduled.

Constraints

1 <= N <= 10 ^ 9

0 <= M <= 2 * 10 ^ 5

0 <= K <= M

1 <= D[i] <= N

All obligation days are distinct.

Sample Input

20 5 2

3  8 12 15 18

Sample Output

11*/

class deStress{
	public static void main(String args[])
	{
		int d=20;
		int o=5;
		int mo=2;
		int max=0;
		int ind=0;
		int ob[]={3,8,12,15,18};
		for(int i=0;i<ob.length-3;i++)
		{	int diff=ob[i+3]-ob[i];	
			if(diff>max)
			{
				max=diff;
				ind=i;
			}		
		}
		System.out.println(max-1);
	}
}