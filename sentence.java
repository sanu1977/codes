/*
Given a sentence cstr, written in a camel case (i.e. every word starts with an uppercase letter and there is no 
space or punctuation between two consecutive words). The task is to put one space after every word and 
convert every uppercase letter to lowercase.
Example 1:
Input :
ThisIsAnAutomationEra
Output:
this is an automation era
Example 2:
Input:
HeyYou--- Value of cstr
Output:
hey you
Constraints:
● The string cannot contain space.
● Size of cstr <= 500
Input format for testing:
● The candidate has to write the code to accept a single string cstr consisting of only letters of the 
alphabet with no space
*/

class sentence{
	public static void main(String args[])
	{
		String s="ThisIsAnAutomationEra";
		String s1=" ";
		

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s1=s1+" ";
				
			}
			s1=s1+s.charAt(i);
			
		}
		String n=s1.trim();
		System.out.println(n.toLowerCase());
	}
}