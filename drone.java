class drone
{
	public static void main(String[]args)
	{
		int d1=3;
                int c1=2;
		int d2=1;
		int c2=3;
		int d=0;
		int t=0;
		int m1=0;
		int m2=0;
		

		if(c1==c2)
		{
		      d=d1+d2;
 		      t=d*2-1;
		}

		else 
		{
			if(c1%2==0)
				{
				 m1=(d1*2)-1;
                         	}
			else
				{
				 m1=d1*2;
				}
				
			if(c2%2==0)
				{
					 m2=(d2*2)-1;
                         	}
			else
				{
				 m2=d2*2;
				}
			if(m1>m2)
			{
				t=m1;
			}
			else{
				t=m2;
			}
		}
	        System.out.println(t);
	}
}	