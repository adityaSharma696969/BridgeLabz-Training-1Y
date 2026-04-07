import java.util.Scanner;
class Divisibleby
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%5==0){
			System.out.println("Divisible");
		}
		else{
			System.out.println("Not Divisible");
		}
	}
}
