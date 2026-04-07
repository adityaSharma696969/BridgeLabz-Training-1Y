import java.util.Scanner;
class multiple
{
	public static void main(String at[])
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 100;i>=1;i--){
			if(i%a==0){
				System.out.println(i);
			}
		}
	}
}
