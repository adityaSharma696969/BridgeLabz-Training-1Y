import java.util.Scanner;
class negative{
	public static void main(String arg[])
	{
		System.out.println("enter numbers");
Scanner sc = new Scanner(System.in);
int sum = 0;
int num= 1;
while(num!=0&&num!=-1){
sum = sum+num;
num = sc.nextInt();
}
System.out.println(+sum);
	}
}
	