import java.util.Scanner;
class Rocket
{
	public static void main(String arg[])
	{
		System.out.println("enter countdown");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>=1){
			System.out.println(+a);
			a--;
		}
		System.out.println("Take off");
	}
}
