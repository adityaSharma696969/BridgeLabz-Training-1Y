import java.util.Scanner;
class sum 
{
	public static void main(String arg[])
	{
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int inputnumber = 1;
		while(inputnumber!=0){
			sum = sum+inputnumber;
			inputnumber = sc.nextInt();
		}
		System.out.println(+sum);
	}
}

			