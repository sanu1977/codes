import java.util.*;
class circle
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int r=0;
		double a=0;

		r=d/2;
		System.out.println("Radius:"+r);

		a=(3.14*(r*r));
		System.out.println("Area:"+a);
	}
}