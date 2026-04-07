import java.util.Scanner;
class calculator
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int second=sc.nextInt();
		String op=sc.next();
		switch(op)
		{
			case"+":
			System.out.println("Result:" +(first + second));
			break;
			case"-":
			System.out.println("Result:" +(first - second));
			break;
			case"*":
			System.out.println("Result:" +(first*second));
			break;
			case"/":
			if(second!=0)
			{
				System.out.println("Result:" +(first/second));
			}
			else
			{
				System.out.println("Can not divide by zero");
			}
			break;
			default:
			System.out.println("Invalid Operator");
		}
	}
}