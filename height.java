import java.util.Scanner;
class height
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in cm");
		int a=sc.nextInt();
		double b=a/2.54;
		double c=b*12;
		System.out.println("height in inches"+b);
		System.out.println("height in feet"+c);
	}
}

		
