import java.util.Scanner;
class possitive
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0){
			System.out.println("number is possitive");
		}
		else if(a==0){
			
			System.out.println("number is zero");
		}
		else if(a<0){
			System.out.println("number is negative");
		}
	}
}
