import java.util.Scanner;
class for{
public static void main(String arg[])
{
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int factorial = 1;
	int i = 1;
	for(i=1;i<=a;i++){
		factorial=factorial*i;
	}
	System.out.println(+factorial)
}
}
