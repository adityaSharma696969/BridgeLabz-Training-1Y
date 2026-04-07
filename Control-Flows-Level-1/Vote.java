import java.util.Scanner;
class Vote
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=18){
			System.out.println("Person can vote");
		}
		else{
			System.out.println("person can not vote");
		}
	}
}
