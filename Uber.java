/*Uber problem statement*/

class Uber{
	public static void main(String args[])
	{
		int b=30;
		int pk[]={10,5};
		int pc[]={12,5};
		int p=0;
		int pci=0;
		int pce=0;
		int r=0;
	
		for(int i=0;i<pc.length;i++)
		{
			p=b%pc[i];
			
			if(p==0)
			{
				pci=i;
				pce=pc[i];

			}
		}
		int d=b/pc[pci];
		System.out.println(pci+" "+pce);
		
		r=pk[pci]*d;

		System.out.println(r);
	}
}

		