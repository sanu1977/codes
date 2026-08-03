/*Problem Statement:
A school maintains marks of students in multiple subjects in a 2D matrix. Each row represents one student. Each column rpresents one subject. You are given integers N and M followed by N x M integers representing marks. A student is considered Passed' if the average of marks is strictly greater than 50. Print the total number of students who passed.

Input Format: First line contains two space-separated integers: NM Next N lines contain M space-separated integers each.

Output Format: Print a single integer representing the number of students who passed.

Sample Test Cases: Test Case 1: Input: 3 3
60 70 80
40 50 60
30 40 50
Output: 2

Test Case 2:
 Input: 2 4
55 60 45 50
20 30 40 50
Output: 1

Test Case 3:
Input: 1 5
10 20 30 40 50
Output: 0*/

class subjectMarks{	
	public static void main(String args[])
	{
		int n=2;
		int m=4;
		
		int c=0;
		
		//int marr[][]={{60,70,80},{40,50,60},{30,40,50}};
		int marr[][]={{55,60,45,50},{20,30,40,50}};
		for(int i=0;i<marr.length;i++)
		{	int ma=0;
			for(int j=0;j<marr[i].length;j++)
			{
				 ma+=marr[i][j];
				
			}
			
			int r=ma/m;
			
			if(r>=50)
			{
				c++;
			}
			
		}
		System.out.println(c);
	}
}