import java.util.Scanner;
class bonus
{
	public static void main(String ar[])
	{
		System.out.println("enter salary");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("enter years");
int b = sc.nextInt();
if(b>=5){
System.out.println(+(a*5/100));}
else{
System.out.println("no bonus");}
	}
}
	