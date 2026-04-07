import java.util.Scanner;
class Natural
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=a;i++){
		 sum = sum + i; 	
		} System.out.println("number is natural and sum is" +sum);
	}
}
	