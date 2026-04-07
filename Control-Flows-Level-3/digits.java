import java.util.Scanner;
class digits
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("No of digits:" + count);
	}
}