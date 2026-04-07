import java.util.Scanner;
class Power
{
public static void main (String args[])
{
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter power");
int p=sc.nextInt();
int result=1;
for(int i=1;i<=p;i++){
result=result*n;
}
System.out.println("result= "+result);
}
}