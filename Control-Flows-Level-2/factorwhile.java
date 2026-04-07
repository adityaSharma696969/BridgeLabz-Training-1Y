import java.util.Scanner;
class factor
{
	public static void main(String arg[])
	{
		System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);    
		int a = sc.nextInt();
		int i = 1;
		while(i<=a){
			if(a%i==0){
		System.out.println(i);}
		i++;
	}
}
}

