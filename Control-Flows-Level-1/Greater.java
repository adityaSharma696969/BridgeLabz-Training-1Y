import java.util.Scanner;
class Smallest
{
	public static void main(String arg[])
	{
		System.out.println("Enter three number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		{
		if(a>b&&a>c){
			System.out.println("a is greater");
		}
		else{
			System.out.println("a is not greater");
		}
		}
		{
		if(b>a&&b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("b is not greater");
		}
		}
		{
		if(c>b&&c>a){
			System.out.println("c is greater");
		}
		else{
			System.out.println("c is not greater");
		}
		}
	}
}
