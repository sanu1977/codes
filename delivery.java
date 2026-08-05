/*Amazon delivery drone*/

class delivery{
	public static void main(String args[])
	{
		int c1=2;
		int c2=3;
		int d1=3;
		int d2=1;
		int m=0;
		int d1m=0;
		int d2m=0;

		if(c1==c2)
		{
			m=(d1+d2)*2-1;
		}
		else{
			if(c1%2==0)
			{
				d1m=(d1*2)-1;
			}
			else{
				d1m=d1*2;
			}
			if(c2%2==0)
			{
				d2m=(d2*2)-1;
	  		}
			else{
				d2m=d2*2;
			}
			if(d1m>d2m)
			{
				m=d1m;
			}
			else{
				m=d2m;
			}
		}
		System.out.println(m);
	}
}