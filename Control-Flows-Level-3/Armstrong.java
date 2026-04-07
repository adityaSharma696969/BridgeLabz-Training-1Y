import java.util.Scanner;
class Armstrong
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,c,arm=0;
		c=n;
		while(n>0)
		{
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm)
		{
			System.out.println("Armstrong Number:");
		}
		else
		{
			System.out.println("Not Armstrong Number:");
		}
	}
}