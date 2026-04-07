import java.util.Scanner;
class dio
{
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int factorial = 1;
		int i = 1 ;
		while(i<=a){
			factorial=factorial*i;
			i++;
		}
		System.out.println(+factorial);
	}
}