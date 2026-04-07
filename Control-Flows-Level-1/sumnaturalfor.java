import java.util.Scanner;
class ppo
{public static void main(String arg[])
	{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int sumtwo=0;
		for(int i = 0; i<=a; i++){
			sum=sum+i;
		} sumtwo= a*(a+1)/2;
		System.out.println(+sumtwo);
		System.out.println(+sum);
	 if(sum==sumtwo){
	 System.out.println("both are equal");}
	 else{System.out.println("both are not equal");
	 }
	}
}
