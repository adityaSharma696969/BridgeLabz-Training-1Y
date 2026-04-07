import java.util.Scanner;
class great
{
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
		imt counter = a-1;
         while(counter>=1){
if(a%counter==0){
b=counter;
break;
}
counter--;
	}
System.out.println("greatest factor is"+a);
}
}
	