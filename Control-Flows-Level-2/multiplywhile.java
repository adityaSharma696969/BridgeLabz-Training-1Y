import java.util.Scanner; 
class Multiply
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int counter=n-1;
while(counter>=1)
{
if(counter%n==0)
{
	System.out.println(counter);
}
counter--;
}
}
}