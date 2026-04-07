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
		if(a<b&&a<c){
			System.out.println("a is smallest");
		}
		else{
			System.out.println("a is not smallest");
		}
		}
		{
		if(b<a&&b<c){
			System.out.println("b is smallest");
		}
		else{
			System.out.println("b is not smallest");
		}
		}
		{
		if(c<b&&c<a){
			System.out.println("c is smallest");
		}
		else{
			System.out.println("c is not smallest");
		}
		}
	}
}
