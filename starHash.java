/*
Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to
find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the
number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input
string.
(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:
###*** -> Value of S
Output :
0 → number of * and # are equal*/

class starHash{
	public static void main(String args[])
	{
		String s="#***#";
		int sc=0;
		int hc=0;

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				sc++;
			}
			else{
				hc++;
			}
		}
			
		System.out.println(sc+" "+hc);
		if(sc>hc)
		{
			System.out.println("1");
			int st=sc-hc;
			System.out.println("Increases "+st+" *");
		}
		else if(sc<hc)
		{
			System.out.println("-1");
			int ht=hc-sc;
			System.out.println("Increases "+ht+" #");
		}
		else{
			System.out.println("0");
		}
	}
}