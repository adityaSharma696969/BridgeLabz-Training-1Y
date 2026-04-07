import java.util.Scanner;
class zero
{
	public static void main(String arg[])
	{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		int i = 1;
		int sumtwo = 0;
		while(i<=a){
			sum=sum+i;
			i++;
		}
		 sumtwo = a*(a+1)/2;
		System.out.println(+sum);
		System.out.println(+sumtwo);
		if(sum==sumtwo){
		System.out.println("Both are equal");}
		else{System.out.println("not equal");}
		
	}
}
	
			