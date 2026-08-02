/*Given two strings s1 and s2 consisting of only lowercase English letters and of equal length, check if these two strings are isomorphic to each other.
If the characters in s1 can be changed to get s2, then two strings, s1 and s2 are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Examples:

Input: s1 = "aab", s2 = "xxy"
Output: true
Explanation: Each character in s1 can be consistently mapped to a unique character in s2 (a → x, b → y).
Input: s1 = "aab", s2 = "xyz"
Output: false
Explanation: Same character 'a' in s1 maps to two different characters 'x' and 'y' in s2.
Input: s1 = "abc", s2 = "xxz"
Output: false
Explanation: Two different characters 'a' and 'b' in s1 maps with same character 'x' in s2.
*/

class stringEqual{
	public static void main(String args[])
	{
		String s1="abc";
		String s2="xxz";
		int s1c=0;
		int s2c=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1))
			{
				 s1c++;
				
			}
		}

		for(int i=0;i<s2.length()-1;i++)
		{
			if(s2.charAt(i)==s2.charAt(i+1))
			{
				 s2c++;
			}
		}

		if(s1c==s2c)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}